package com.vizuri.fhir;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Points implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Double addValue;
   private java.lang.Double totalPoints;

   public Points()
   {
   }

   public java.lang.Double getAddValue()
   {
      return this.addValue;
   }

   public void setAddValue(java.lang.Double addValue)
   {
      this.addValue = addValue;
   }

   public java.lang.Double getTotalPoints()
   {
      return this.totalPoints;
   }
   
   public void addPointTotal(java.lang.Double points)
   {
      this.setTotalPoints(this.totalPoints + points);
   }

   public void setTotalPoints(java.lang.Double totalPoints)
   {
      this.totalPoints = totalPoints;
   }

   public Points(java.lang.Double addValue, java.lang.Double totalPoints)
   {
      this.addValue = addValue;
      this.totalPoints = totalPoints;
   }

}