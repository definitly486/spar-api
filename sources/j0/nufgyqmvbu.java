package j0;

import android.text.Editable;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes.dex */
final class nufgyqmvbu implements ContentHandler {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ContentHandler f50297iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f50298ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private draadjrbmk f50299wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Editable f50300zoijcleaow;

    public nufgyqmvbu(ContentHandler contentHandler, Editable editable) {
        this.f50297iobyxmoadg = contentHandler;
        this.f50300zoijcleaow = editable;
    }

    private final void eablkybsjg() {
        iobyxmoadg();
        this.f50299wkgbmnqykc = new draadjrbmk(gtknphoqwx.f50211nufgyqmvbu.iobyxmoadg(), this.f50298ppxfxbqfkf, this.f50300zoijcleaow.length());
    }

    private final void gxszxtbevo() {
        iobyxmoadg();
        this.f50298ppxfxbqfkf--;
    }

    private final void iobyxmoadg() {
        draadjrbmk draadjrbmkVar = this.f50299wkgbmnqykc;
        if (draadjrbmkVar != null) {
            this.f50300zoijcleaow.setSpan(draadjrbmkVar, draadjrbmkVar.ppxfxbqfkf(), this.f50300zoijcleaow.length(), 33);
        }
        this.f50299wkgbmnqykc = null;
    }

    private final void lqeggnwhkg() {
        iobyxmoadg();
        this.f50298ppxfxbqfkf++;
    }

    private final void ppxfxbqfkf(Attributes attributes) {
        int length = attributes.getLength();
        for (int i13 = 0; i13 < length; i13++) {
            String localName = attributes.getLocalName(i13);
            if (localName == null) {
                localName = "";
            }
            String value = attributes.getValue(i13);
            String str = value != null ? value : "";
            if (localName.length() > 0 && str.length() > 0) {
                int length2 = this.f50300zoijcleaow.length();
                this.f50300zoijcleaow.setSpan(new dxjokdxxww(localName, str), length2, length2, 17);
            }
        }
    }

    private final void wkgbmnqykc() {
        iobyxmoadg();
    }

    private final void zoijcleaow() {
        Editable editable = this.f50300zoijcleaow;
        Object[] spans = editable.getSpans(0, editable.length(), dxjokdxxww.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if (this.f50300zoijcleaow.getSpanFlags((dxjokdxxww) obj) == 17) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) arrayList.get(i13);
            int spanStart = this.f50300zoijcleaow.getSpanStart(dxjokdxxwwVar);
            int length = this.f50300zoijcleaow.length();
            this.f50300zoijcleaow.removeSpan(dxjokdxxwwVar);
            if (spanStart != length) {
                this.f50300zoijcleaow.setSpan(dxjokdxxwwVar, spanStart, length, 33);
            }
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i13, int i14) throws SAXException {
        this.f50297iobyxmoadg.characters(cArr, i13, i14);
    }

    @Override // org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        this.f50297iobyxmoadg.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        gxszxtbevo();
                        return;
                    }
                } else if (str2.equals("li")) {
                    wkgbmnqykc();
                    return;
                }
            } else if (str2.equals("annotation")) {
                zoijcleaow();
                return;
            }
        }
        this.f50297iobyxmoadg.endElement(str, str2, str3);
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
        this.f50297iobyxmoadg.endPrefixMapping(str);
    }

    @Override // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i13, int i14) throws SAXException {
        this.f50297iobyxmoadg.ignorableWhitespace(cArr, i13, i14);
    }

    @Override // org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
        this.f50297iobyxmoadg.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        this.f50297iobyxmoadg.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
        this.f50297iobyxmoadg.skippedEntity(str);
    }

    @Override // org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        this.f50297iobyxmoadg.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        lqeggnwhkg();
                        return;
                    }
                } else if (str2.equals("li")) {
                    eablkybsjg();
                    return;
                }
            } else if (str2.equals("annotation")) {
                if (attributes != null) {
                    ppxfxbqfkf(attributes);
                    return;
                }
                return;
            }
        }
        this.f50297iobyxmoadg.startElement(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
        this.f50297iobyxmoadg.startPrefixMapping(str, str2);
    }
}
