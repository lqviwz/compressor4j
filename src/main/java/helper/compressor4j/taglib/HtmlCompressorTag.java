package helper.compressor4j.taglib;

import com.googlecode.htmlcompressor.compressor.HtmlCompressor;

public class HtmlCompressorTag extends com.googlecode.htmlcompressor.taglib.HtmlCompressorTag {

	private static final long serialVersionUID = -3933379923476187615L;
	public  HtmlCompressorTag(){
		super();
		this.setJsCompressor(HtmlCompressor.JS_COMPRESSOR_CLOSURE);
		this.setCompressJavaScript(true);
		this.setCompressCss(true);
		this.setRemoveIntertagSpaces(true);
	}

}
