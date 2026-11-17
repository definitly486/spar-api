package modern.payments.ecomAndroid.util.htmlParser.impl;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import modern.payments.ecomAndroid.util.htmlParser.HtmlFormParser;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0002¨\u0006\u001a"}, d2 = {"Lmodern/payments/ecomAndroid/util/htmlParser/impl/HtmlFormParserImpl;", "Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser;", "()V", "extractAllFormBlocks", "", "", "html", "extractAllFormsWithCRes", "Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser$FormWithCRes;", "extractAllFormsWithPaRes", "Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser$FormWithPaRes;", "extractAttribute", "attributes", "attrName", "extractCResValue", "formBlock", "extractCResValueRobust", "extractFormsWithAttributes", "Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser$FormData;", "extractPaResValue", "extractPaResValueRobust", "extractValueFromInput", "inputTag", "hasAttribute", "", "attribute", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HtmlFormParserImpl implements HtmlFormParser {
    private final String extractAttribute(String attributes, String attrName) {
        Matcher matcher = Pattern.compile(attrName + "\\s*=\\s*['\"]([^'\"]*)['\"]", 2).matcher(attributes);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private final String extractValueFromInput(String inputTag) {
        Matcher matcher = Pattern.compile("value\\s*=\\s*['\"]([^'\"]*)['\"]", 2).matcher(inputTag);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private final boolean hasAttribute(String inputTag, String attribute) {
        return Pattern.compile("name\\s*=\\s*['\"]" + attribute + "['\"]", 2).matcher(inputTag).find();
    }

    @Override // modern.payments.ecomAndroid.util.htmlParser.HtmlFormParser
    public List<String> extractAllFormBlocks(String html) {
        zdlpuopuiu.btonecajqb(html, "html");
        Pattern patternCompile = Pattern.compile("<form[^>]*>.*?</form>", 34);
        ArrayList arrayList = new ArrayList();
        Matcher matcher = patternCompile.matcher(html);
        while (matcher.find()) {
            String strGroup = matcher.group();
            zdlpuopuiu.dxjokdxxww(strGroup, "group(...)");
            arrayList.add(strGroup);
        }
        return arrayList;
    }

    @Override // modern.payments.ecomAndroid.util.htmlParser.HtmlFormParser
    public List<HtmlFormParser.FormWithCRes> extractAllFormsWithCRes(String html) {
        zdlpuopuiu.btonecajqb(html, "html");
        List<HtmlFormParser.FormData> listExtractFormsWithAttributes = extractFormsWithAttributes(html);
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listExtractFormsWithAttributes, 10));
        for (HtmlFormParser.FormData formData : listExtractFormsWithAttributes) {
            arrayList.add(new HtmlFormParser.FormWithCRes(formData, extractCResValueRobust(formData.getContent())));
        }
        return arrayList;
    }

    @Override // modern.payments.ecomAndroid.util.htmlParser.HtmlFormParser
    public List<HtmlFormParser.FormWithPaRes> extractAllFormsWithPaRes(String html) {
        zdlpuopuiu.btonecajqb(html, "html");
        List<HtmlFormParser.FormData> listExtractFormsWithAttributes = extractFormsWithAttributes(html);
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listExtractFormsWithAttributes, 10));
        for (HtmlFormParser.FormData formData : listExtractFormsWithAttributes) {
            arrayList.add(new HtmlFormParser.FormWithPaRes(formData, extractPaResValueRobust(formData.getContent())));
        }
        return arrayList;
    }

    @Override // modern.payments.ecomAndroid.util.htmlParser.HtmlFormParser
    public String extractCResValue(String formBlock) {
        zdlpuopuiu.btonecajqb(formBlock, "formBlock");
        Iterator it = jyumaefscl.rgvfuqvkyq(Pattern.compile("<input[^>]*?name\\s*=\\s*['\"]CRes['\"][^>]*?value\\s*=\\s*['\"]([^'\"]*)['\"][^>]*>", 2), Pattern.compile("<input\\s+[^>]*?value\\s*=\\s*['\"]([^'\"]*)['\"][^>]*?name\\s*=\\s*['\"]CRes['\"][^>]*>", 2), Pattern.compile("<input[^>]*?name\\s*=\\s*['\"]?CRes['\"]?[^>]*?value\\s*=\\s*['\"]([^'\"]*)['\"][^>]*>", 2)).iterator();
        while (it.hasNext()) {
            Matcher matcher = ((Pattern) it.next()).matcher(formBlock);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    @Override // modern.payments.ecomAndroid.util.htmlParser.HtmlFormParser
    public String extractCResValueRobust(String formBlock) {
        zdlpuopuiu.btonecajqb(formBlock, "formBlock");
        Matcher matcher = Pattern.compile("<input\\s+[^>]*?>", 2).matcher(formBlock);
        while (matcher.find()) {
            String strGroup = matcher.group();
            zdlpuopuiu.lqeggnwhkg(strGroup);
            if (hasAttribute(strGroup, "CRes")) {
                return extractValueFromInput(strGroup);
            }
        }
        return null;
    }

    @Override // modern.payments.ecomAndroid.util.htmlParser.HtmlFormParser
    public List<HtmlFormParser.FormData> extractFormsWithAttributes(String html) {
        zdlpuopuiu.btonecajqb(html, "html");
        Pattern patternCompile = Pattern.compile("<form\\s+([^>]*)>(.*?)</form>", 34);
        ArrayList arrayList = new ArrayList();
        Matcher matcher = patternCompile.matcher(html);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            String strExtractAttribute = extractAttribute(strGroup == null ? "" : strGroup, "action");
            String strExtractAttribute2 = extractAttribute(strGroup == null ? "" : strGroup, "method");
            String strExtractAttribute3 = extractAttribute(strGroup == null ? "" : strGroup, "id");
            if (strGroup == null) {
                strGroup = "";
            }
            arrayList.add(new HtmlFormParser.FormData(strExtractAttribute, strExtractAttribute2, strExtractAttribute3, extractAttribute(strGroup, ExternalMetricsManagerImpl.NAME), strGroup2 == null ? "" : strGroup2));
        }
        return arrayList;
    }

    @Override // modern.payments.ecomAndroid.util.htmlParser.HtmlFormParser
    public String extractPaResValue(String formBlock) {
        zdlpuopuiu.btonecajqb(formBlock, "formBlock");
        Iterator it = jyumaefscl.rgvfuqvkyq(Pattern.compile("<input[^>]*?name\\s*=\\s*['\"]PaRes['\"][^>]*?value\\s*=\\s*['\"]([^'\"]*)['\"][^>]*>", 2), Pattern.compile("<input\\s+[^>]*?value\\s*=\\s*['\"]([^'\"]*)['\"][^>]*?name\\s*=\\s*['\"]PaRes['\"][^>]*>", 2), Pattern.compile("<input[^>]*?name\\s*=\\s*['\"]?PaRes['\"]?[^>]*?value\\s*=\\s*['\"]([^'\"]*)['\"][^>]*>", 2)).iterator();
        while (it.hasNext()) {
            Matcher matcher = ((Pattern) it.next()).matcher(formBlock);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    @Override // modern.payments.ecomAndroid.util.htmlParser.HtmlFormParser
    public String extractPaResValueRobust(String formBlock) {
        zdlpuopuiu.btonecajqb(formBlock, "formBlock");
        Matcher matcher = Pattern.compile("<input\\s+[^>]*?>", 2).matcher(formBlock);
        while (matcher.find()) {
            String strGroup = matcher.group();
            zdlpuopuiu.lqeggnwhkg(strGroup);
            if (hasAttribute(strGroup, "PaRes")) {
                return extractValueFromInput(strGroup);
            }
        }
        return null;
    }
}
