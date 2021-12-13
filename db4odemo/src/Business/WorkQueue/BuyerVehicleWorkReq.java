/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author saneel
 */
public class BuyerVehicleWorkReq extends WorkRequest{

    private String Vehicle;  //motorcycle, sedan
    private String VehModel; //i20,innova
    private String ManuYear;
    private String MilesDriven;
    private String Comments;

    public String getComments() {
        return Comments;
    }

    public void setComments(String Comments) {
        this.Comments = Comments;
    }

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
    private String TireInf;
    private String VehCond;
    private String MaintDet;

    public String getVehModel() {
        return VehModel;
    }

    public void setVehModel(String VehModel) {
        this.VehModel = VehModel;
    }

    public String getVehCond() {
        return VehCond;
    }

    public void setVehCond(String VehCond) {
        this.VehCond = VehCond;
    }

    public String getMaintDet() {
        return MaintDet;
    }

    public void setMaintDet(String MaintDet) {
        this.MaintDet = MaintDet;
    }
    private String Price;

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

    public void setStatus(String processing) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
