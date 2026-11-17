package y2;

import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class kegysxyocb {
    public static boolean eablkybsjg(XmlPullParser xmlPullParser, String str) {
        return wkgbmnqykc(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static String iobyxmoadg(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i13 = 0; i13 < attributeCount; i13++) {
            if (xmlPullParser.getAttributeName(i13).equals(str)) {
                return xmlPullParser.getAttributeValue(i13);
            }
        }
        return null;
    }

    public static boolean ppxfxbqfkf(XmlPullParser xmlPullParser, String str) {
        return zoijcleaow(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean wkgbmnqykc(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean zoijcleaow(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }
}
