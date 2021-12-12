/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author harsh
 */
public class SellerVehWorkReq extends WorkRequest {
   private String Vehicle;
    private String ManuYear;
    private String MilesDriven;
    private String TireInf;
    private String Price;
    private String Comments;

    public String getVehicle() {
        return Vehicle;
    }

    public void setVehicle(String Vehicle) {
        this.Vehicle = Vehicle;
    }

    public String getManuYear() {
        return ManuYear;
    }

    public void setManuYear(String ManuYear) {
        this.ManuYear = ManuYear;
    }

    public String getMilesDriven() {
        return MilesDriven;
    }

    public void setMilesDriven(String MilesDriven) {
        this.MilesDriven = MilesDriven;
    }



    public String getTireInf() {
        return TireInf;
    }

    public void setTireInf(String TireInf) {
        this.TireInf = TireInf;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String Comments) {
        this.Comments = Comments;
    }
    
    
}
