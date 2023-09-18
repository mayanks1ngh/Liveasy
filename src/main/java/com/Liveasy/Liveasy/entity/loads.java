package com.Liveasy.Liveasy.entity;

import java.util.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class loads {
   private String loadingPoint;
   private String unloadingPoint;
   private String productType;
   private String truckType;
   private long numberoffTrucks;
   private double  weight;
   private String comment;
   @Id
   private Long ShipperId;
   private Date date;
public loads(String loadingPoint, String unloadingPoint, String productType, String truckType, long numberoffTrucks,
		int weight, String optional, long shipperId, int i) {
	super();
	this.loadingPoint = loadingPoint;
	this.unloadingPoint = unloadingPoint;
	this.productType = productType;
	this.truckType = truckType;
	this.numberoffTrucks = numberoffTrucks;
	this.weight = weight;
	// this.comment = comment;
	ShipperId = shipperId;
	
}
public loads(Date date) {
	this.date = date;
}
public String getloadingPoint() {
	return loadingPoint;
}
public void setloadingPoint(String loadingPoint) {
	this.loadingPoint = loadingPoint;
}
public String getunloadingPoint() {
	return unloadingPoint;
}
public void setunloadingPoint(String unloadingPoint) {
	this.unloadingPoint = unloadingPoint;
}
public String getproductType() {
	return productType;
}
public void setProductType(String productType) {
	this.productType = productType;
}
public String gettruckType() {
	return truckType;
}
public void settruckType(String truckType) {
	this.truckType = truckType;
}
public long getnumberoffTrucks() {
	return numberoffTrucks;
}
public void setnumberoffTrucks(long numberoffTrucks) {
	this.numberoffTrucks = (int) numberoffTrucks;
}
public int getweight() {
	return (int) weight;
}
public void setweight(int weight) {
	this.weight = weight;
}
public String getcomment() {
	return comment;
}
@Override
public String toString() {
	return "loads [loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint + ", productType=" + productType
			+ ", truckType=" + truckType + ", numberoffTrucks=" + numberoffTrucks + ", weight=" + weight + ", optional="
			+ comment + ", ShipperId=" + ShipperId + ", date=" + date + "]";
}
public void setcomment(String comment) {
	this.comment = comment;
}
public long getShipperId() {
	return ShipperId;
}
public void setShipperId(long shipperId) {
	ShipperId = shipperId;
}
public  Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

}

  
      