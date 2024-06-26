package com.getir.rig.viewobject;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@ToString
public class StockRequest {

   @NotNull
   private Long productId;
   @NotNull
   private Integer quantity;
   @NotNull
   private Boolean isActive;
}
