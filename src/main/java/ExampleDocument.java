public class ExampleDocument {
  
//	surveyaccess  s = new surveyaccess();
//	private String _id = s.eename;
	public  String _id ="";
	public String EmployeeName="";
	public  String Banda="";
	public  String EmployeeID="";
	public  String Service_Line="";
	public  String Bluepages_Manager_Name="";
	public  String Service_Area="";
	public  String Primary_Job_Role="";
	public  String Test_script_creation ="";
	public  String Test_data_creation="";
	public  String Execute_test_scripts="";
	public  String Write_defects="";
	public  String Effectively_communicate="";
	public  String Use_of_HP_Application_Lifecycle_Management_ALM="";
	public  String Use_of_Rational_ClearCase_and_ClearQuest="";
	public  String Use_of_Rational_Collaborative_Life_cycle_Management_clm_product="";
	public String Use_of_Rational_Doors= null;
	public String  Use_of_Rational_Manual_Tester= null;
	public String  Use_of_Rational_Quality_Manager= null;
	public String  Use_of_Rational_Requirements_Composer= null;

    private String _rev = null;


  public ExampleDocument(String id, String eID, String Band, String sl, String BM, String SA, String PJR, String ts,String td,String ET, String WD, String Ec, String useofhp, String useofrational, String useofrationalcol, String rationald, String urmt,String urqm, String urrc) {
	   _id=eID;
	   EmployeeName=id;
	   EmployeeID=eID;
	   Banda=Band;
	   Service_Line=sl;
	   Bluepages_Manager_Name=BM;
	   Service_Area=SA;
	   Primary_Job_Role=PJR;
	   Test_script_creation=ts;
	   Test_data_creation=td;
	   Execute_test_scripts=ET;
	   Write_defects=WD;
	   Effectively_communicate =Ec;
	   Use_of_HP_Application_Lifecycle_Management_ALM=useofhp;
	   Use_of_Rational_ClearCase_and_ClearQuest=useofrational;
	   Use_of_Rational_Collaborative_Life_cycle_Management_clm_product=useofrationalcol;
	   Use_of_Rational_Doors=rationald;
	   Use_of_Rational_Manual_Tester=urmt;
	   Use_of_Rational_Quality_Manager=urqm;
	   Use_of_Rational_Requirements_Composer= urrc;
  }

  public String toString() {
    return "{ id: " + _id  + ",\nrev: "  + "EmployeeName:  " +  EmployeeName  + " EmployeeID: " + EmployeeID  +"Band: " + Banda +  "  Service Line: " +Service_Line +  "Bluepages Manager Name: " + Bluepages_Manager_Name+ "Service Area"+ Service_Area+"Primary Job Role: "+Primary_Job_Role  +"Test script creation: " + Test_script_creation + "Testdatacreation: " +Test_data_creation +"Execute Test Scripts" +Execute_test_scripts+ "Write defects: " +Write_defects+ "Effectively communicate to stakeholders/client: "+Effectively_communicate  + _rev   + "Use of HP Application Lifecycle" + Use_of_HP_Application_Lifecycle_Management_ALM+ "Use of Rational ClearCase: "+Use_of_Rational_ClearCase_and_ClearQuest+ "Use_of_Rational_Collaborative_Life_cycle_Management"+Use_of_Rational_Collaborative_Life_cycle_Management_clm_product + Use_of_Rational_Doors+  Use_of_Rational_Manual_Tester+ Use_of_Rational_Quality_Manager +Use_of_Rational_Requirements_Composer+ "\n}";
  }
}