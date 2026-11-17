package vl;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import org.jsoup.select.Selector;
import org.jsoup.select.wkgbmnqykc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final wkgbmnqykc f117484eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Pattern f117485iobyxmoadg = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static final String f117486ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final char[] f117487wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final Charset f117488zoijcleaow;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        f117488zoijcleaow = charsetForName;
        f117486ppxfxbqfkf = charsetForName.name();
        f117487wkgbmnqykc = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        f117484eablkybsjg = Selector.iobyxmoadg("meta[http-equiv=content-type], meta[charset]");
    }
}
