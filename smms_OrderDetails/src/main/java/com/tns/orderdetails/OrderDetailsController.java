package com.tns.orderdetails;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class OrderDetailsController {
	
      @Autowired	
      private OrderDetailsService service;	
      
   // RESTful API methods for retrieving all orders
      
    @GetMapping("/orderdetails")	
      public List<OrderDetails> list() 
      {
      return service.listAll();
      }
      
 // Retrieve Operation (retrieving order by id)   
      @GetMapping("/orderdetails/{id}")
      public ResponseEntity<OrderDetails> get(@PathVariable Integer id) 
      {
      try
      {
    	  OrderDetails orderdetails = service.get(id);
      return new ResponseEntity<OrderDetails>(orderdetails, HttpStatus.OK);
      } 
      catch (NoSuchElementException e) 
      {
      return new ResponseEntity<OrderDetails>(HttpStatus.NOT_FOUND);
      } 
      }
      // RESTful API method for Create operation
      @PostMapping("/orderdetails")  // annotation ensures that HTTP POST requests to /Orders are mapped to add() method.
      public void add(@RequestBody OrderDetails orderdetails) 
      {
      service.save(orderdetails);
      }
      
      // RESTful API method for Update operation
      @PutMapping("/orderdetails/{id}")
      public ResponseEntity<?> update(@RequestBody OrderDetails orderdetails, @PathVariable Integer id) 
      {
      try
      {
    	OrderDetails existOrderDetails = service.get(id);
      service.save(orderdetails);
      return new ResponseEntity<>(HttpStatus.OK);
      } 
      catch (NoSuchElementException e) 
      {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      } 
      }
      // RESTful API method for Delete operation
      @DeleteMapping("/orderdetails/{id}")
      public void delete(@PathVariable Integer id) 
      {
      service.delete(id);
      }
}
