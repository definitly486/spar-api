package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import modern.payments.ecomAndroid.util.htmlParser.HtmlFormParser;

/* JADX INFO: loaded from: classes3.dex */
public final class UtilModule_ProvideHtmlFormParserFactory implements wkgbmnqykc {
    private final UtilModule module;

    public UtilModule_ProvideHtmlFormParserFactory(UtilModule utilModule) {
        this.module = utilModule;
    }

    public static UtilModule_ProvideHtmlFormParserFactory create(UtilModule utilModule) {
        return new UtilModule_ProvideHtmlFormParserFactory(utilModule);
    }

    public static HtmlFormParser provideHtmlFormParser(UtilModule utilModule) {
        return (HtmlFormParser) dxjokdxxww.eablkybsjg(utilModule.provideHtmlFormParser());
    }

    @Override // fg.iobyxmoadg
    public HtmlFormParser get() {
        return provideHtmlFormParser(this.module);
    }
}
