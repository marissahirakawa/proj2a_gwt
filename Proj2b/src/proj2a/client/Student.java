package proj2a.client;
import com.google.gwt.core.client.JavaScriptObject;

class Student extends JavaScriptObject
{
	protected Student()
	{}
	public final native int getID()
	/*-{
	   return this.student.id;
	 }-*/;
	public final native String getFirstName()
	/*-{
	 	return this.studetn.first_name;
	 }-*/;
	public final native String getLastName()
	/*-{
		return this.last_name;
	}-*/;
	public final native String getMajor()
	/*-{
	 	return this.student.major;
	 }-*/;

	
}
