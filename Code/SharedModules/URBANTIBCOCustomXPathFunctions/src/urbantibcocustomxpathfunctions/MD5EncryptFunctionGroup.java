package urbantibcocustomxpathfunctions;

import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;
import java.security.MessageDigest;
import java.io.UnsupportedEncodingException;

@XPathFunctionGroup(category = "URBANTIBCOCustomXPathFunctions", prefix = "md5encrypt", namespace = "md5encrypt", helpText = "md5encrypt")
public class MD5EncryptFunctionGroup {

	@XPathFunction(helpText = "Description", parameters = { @XPathFunctionParameter(name = "source", optional = false, optionalValue = "") })
	public String md5encrypt(String source) {
		 byte[] input;
	        try {
	            input = source.getBytes("UTF-8");
	        }
	        catch (UnsupportedEncodingException ex2) {
	            input = source.getBytes();
	        }
	        String s2 = null;
	        final char[] array = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
	        try {
	            final MessageDigest instance = MessageDigest.getInstance("MD5");
	            instance.update(input);
	            final byte[] digest = instance.digest();
	            final char[] value = new char[32];
	            int n = 0;
	            for (int i = 0; i < 16; ++i) {
	                final byte b = digest[i];
	                value[n++] = array[b >>> 4 & 0xF];
	                value[n++] = array[b & 0xF];
	            }
	            s2 = new String(value);
	        }
	        catch (Exception ex) {
	            ex.printStackTrace();
	        }
	        return s2;
	}
}
