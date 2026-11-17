package h4;

import com.google.common.collect.zdlpuopuiu;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;
import v2.yggfygwlhe;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class agtfadlqog extends dxjokdxxww {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f39337ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final zdlpuopuiu f39338wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f39339zoijcleaow;

    public agtfadlqog(String str, String str2, List list) {
        super(str);
        y2.iobyxmoadg.iobyxmoadg(!list.isEmpty());
        this.f39339zoijcleaow = str2;
        zdlpuopuiu zdlpuopuiuVarJyumaefscl = zdlpuopuiu.jyumaefscl(list);
        this.f39338wkgbmnqykc = zdlpuopuiuVarJyumaefscl;
        this.f39337ppxfxbqfkf = (String) zdlpuopuiuVarJyumaefscl.get(0);
    }

    private static List wkgbmnqykc(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || agtfadlqog.class != obj.getClass()) {
            return false;
        }
        agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
        return Objects.equals(this.f39346iobyxmoadg, agtfadlqogVar.f39346iobyxmoadg) && Objects.equals(this.f39339zoijcleaow, agtfadlqogVar.f39339zoijcleaow) && this.f39338wkgbmnqykc.equals(agtfadlqogVar.f39338wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f39346iobyxmoadg.hashCode()) * 31;
        String str = this.f39339zoijcleaow;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f39338wkgbmnqykc.hashCode();
    }

    @Override // h4.dxjokdxxww
    public String toString() {
        return this.f39346iobyxmoadg + ": description=" + this.f39339zoijcleaow + ": values=" + this.f39338wkgbmnqykc;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // v2.jyumaefscl.iobyxmoadg
    public void zoijcleaow(yggfygwlhe.zoijcleaow zoijcleaowVar) {
        String str = this.f39346iobyxmoadg;
        str.hashCode();
        byte b13 = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b13 = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b13 = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b13 = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b13 = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b13 = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b13 = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b13 = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b13 = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b13 = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b13 = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b13 = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b13 = 11;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    b13 = 12;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b13 = 13;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b13 = 14;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b13 = 15;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b13 = 16;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b13 = 17;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b13 = 18;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b13 = 19;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b13 = 20;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b13 = 21;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b13 = 22;
                }
                break;
        }
        try {
            switch (b13) {
                case 0:
                case 10:
                    zoijcleaowVar.wypolnanlu((CharSequence) this.f39338wkgbmnqykc.get(0));
                    break;
                case 1:
                case 11:
                    zoijcleaowVar.ntlheqmsrt((CharSequence) this.f39338wkgbmnqykc.get(0));
                    break;
                case 2:
                case 13:
                    String str2 = (String) this.f39338wkgbmnqykc.get(0);
                    zoijcleaowVar.rlfsiqarku(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).metgxyhuhe(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    zoijcleaowVar.stevsuqkhv((CharSequence) this.f39338wkgbmnqykc.get(0));
                    break;
                case 4:
                case 19:
                    zoijcleaowVar.dsvhmnatus((CharSequence) this.f39338wkgbmnqykc.get(0));
                    break;
                case 5:
                case 20:
                    zoijcleaowVar.ulzqkzuiru((CharSequence) this.f39338wkgbmnqykc.get(0));
                    break;
                case 6:
                case 21:
                    String[] strArrK = stevsuqkhv.k((String) this.f39338wkgbmnqykc.get(0), CardDateFormatTextWatcher.DIVIDER_CHARACTER);
                    zoijcleaowVar.weqkydbzbr(Integer.valueOf(Integer.parseInt(strArrK[0]))).iyctptxqzt(strArrK.length > 1 ? Integer.valueOf(Integer.parseInt(strArrK[1])) : null);
                    break;
                case 7:
                case 17:
                    zoijcleaowVar.bfopjjpdmp((CharSequence) this.f39338wkgbmnqykc.get(0));
                    break;
                case 8:
                case 16:
                    zoijcleaowVar.lrnfpwlwnk((CharSequence) this.f39338wkgbmnqykc.get(0));
                    break;
                case 9:
                case 22:
                    zoijcleaowVar.czzsidtyhn(Integer.valueOf(Integer.parseInt((String) this.f39338wkgbmnqykc.get(0))));
                    break;
                case 12:
                    Integer numWflxmlrfwp = com.google.common.primitives.gxszxtbevo.wflxmlrfwp((String) this.f39338wkgbmnqykc.get(0));
                    if (numWflxmlrfwp != null) {
                        String strIobyxmoadg = btonecajqb.iobyxmoadg(numWflxmlrfwp.intValue());
                        if (strIobyxmoadg != null) {
                            zoijcleaowVar.ikoacuggdj(strIobyxmoadg);
                        }
                    } else {
                        zoijcleaowVar.ikoacuggdj((CharSequence) this.f39338wkgbmnqykc.get(0));
                    }
                    break;
                case 14:
                    List listWkgbmnqykc = wkgbmnqykc((String) this.f39338wkgbmnqykc.get(0));
                    int size = listWkgbmnqykc.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                zoijcleaowVar.metgxyhuhe((Integer) listWkgbmnqykc.get(2));
                            }
                        }
                        zoijcleaowVar.rlfsiqarku((Integer) listWkgbmnqykc.get(1));
                    }
                    zoijcleaowVar.czzsidtyhn((Integer) listWkgbmnqykc.get(0));
                    break;
                case 15:
                    List listWkgbmnqykc2 = wkgbmnqykc((String) this.f39338wkgbmnqykc.get(0));
                    int size2 = listWkgbmnqykc2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                zoijcleaowVar.uwvvkdfqfp((Integer) listWkgbmnqykc2.get(2));
                            }
                        }
                        zoijcleaowVar.yfnezrywwk((Integer) listWkgbmnqykc2.get(1));
                    }
                    zoijcleaowVar.ydmasvzmpa((Integer) listWkgbmnqykc2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
