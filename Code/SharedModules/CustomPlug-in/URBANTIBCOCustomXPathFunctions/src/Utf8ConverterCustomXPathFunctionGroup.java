import convertToUtf8.Utf8Converter;
import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

@XPathFunctionGroup(category = "URBANTIBCOCustomXPathFunctions", prefix = "URBANTIBCOCustomXPathFunctions", namespace = "java://Utf8Converter", helpText = "Utf8Converter")
public class Utf8ConverterCustomXPathFunctionGroup {
	@XPathFunction(parameters = { @XPathFunctionParameter(name = "string1") }, helpText = "")
	public java.lang.String convertToUtf8(java.lang.String string1) {
		return Utf8Converter.convertToUtf8(string1);
	}
}
