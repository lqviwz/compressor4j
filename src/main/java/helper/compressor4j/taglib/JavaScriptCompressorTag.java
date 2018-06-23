package helper.compressor4j.taglib;

import com.googlecode.htmlcompressor.compressor.HtmlCompressor;

public class JavaScriptCompressorTag extends com.googlecode.htmlcompressor.taglib.JavaScriptCompressorTag {

	private static final long serialVersionUID = 7831297798193765580L;

	public JavaScriptCompressorTag() {
		super();
		this.setJsCompressor(HtmlCompressor.JS_COMPRESSOR_CLOSURE);
	}
}
