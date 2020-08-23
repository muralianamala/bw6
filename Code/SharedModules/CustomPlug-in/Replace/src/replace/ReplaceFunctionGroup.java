package replace;

import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

@XPathFunctionGroup(category = "URBANTIBCOCustomXPathFunctions", prefix = "replace", namespace = "replace", helpText = "replace")
public class ReplaceFunctionGroup {

	@XPathFunction(helpText = "Description", parameters = {
			@XPathFunctionParameter(name = "source", optional = false, optionalValue = ""),
			@XPathFunctionParameter(name = "pattern", optional = false, optionalValue = ""),
			@XPathFunctionParameter(name = "replace", optional = false, optionalValue = "") })
	public String replace(String source, String pattern, String replace) {
		if (source!=null)
        {
        	final int len = pattern.length();
       		StringBuffer sb = new StringBuffer();
	 	int found = -1;
	     	 int start = 0;
        while( (found = source.indexOf(pattern, start) ) != -1) {
            sb.append(source.substring(start, found));
            sb.append(replace);
            start = found + len;
        }
        sb.append(source.substring(start));
        return sb.toString();
        }
        else return "";
	}
}
