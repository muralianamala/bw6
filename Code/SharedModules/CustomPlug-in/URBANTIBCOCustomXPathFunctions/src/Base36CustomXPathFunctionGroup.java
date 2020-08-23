import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

@XPathFunctionGroup(category="URBANTIBCOCustomXPathFunctions",prefix="URBANTIBCOCustomXPathFunctions",namespace="java://Base36",helpText="Base36") public class Base36CustomXPathFunctionGroup {
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String base36decoding(  java.lang.String string1){
    return Base36.base36decoding(string1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String base36encoding(  java.lang.String string1){
    return Base36.base36encoding(string1);
  }
}
