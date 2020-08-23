import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

@XPathFunctionGroup(category="URBANTIBCOCustomXPathFunctions",prefix="URBANTIBCOCustomXPathFunctions",namespace="java://BinMD5Base64",helpText="BinMD5Base64") public class BinMD5Base64CustomXPathFunctionGroup {
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String md5base64(  java.lang.String string1){
    return BinMD5Base64.md5base64(string1);
  }
}
