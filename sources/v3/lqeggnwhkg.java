package v3;

import com.google.common.collect.zdlpuopuiu;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
final class lqeggnwhkg implements iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final androidx.media3.common.iobyxmoadg f115874iobyxmoadg;

    public lqeggnwhkg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        this.f115874iobyxmoadg = iobyxmoadgVar;
    }

    private static iobyxmoadg eablkybsjg(yadqdtsiqt yadqdtsiqtVar) {
        int iLereixgezr = yadqdtsiqtVar.lereixgezr();
        String strZoijcleaow = zoijcleaow(iLereixgezr);
        if (strZoijcleaow == null) {
            kcexrzcfyt.nufgyqmvbu("StreamFormatChunk", "Ignoring track with unsupported format tag " + iLereixgezr);
            return null;
        }
        int iLereixgezr2 = yadqdtsiqtVar.lereixgezr();
        int iYggfygwlhe = yadqdtsiqtVar.yggfygwlhe();
        yadqdtsiqtVar.crxdokpmqz(6);
        int iJztzpxfvev = stevsuqkhv.jztzpxfvev(yadqdtsiqtVar.lereixgezr());
        int iLereixgezr3 = yadqdtsiqtVar.iobyxmoadg() > 0 ? yadqdtsiqtVar.lereixgezr() : 0;
        androidx.media3.common.iobyxmoadg.zoijcleaow zoijcleaowVar = new androidx.media3.common.iobyxmoadg.zoijcleaow();
        zoijcleaowVar.zeieaojujs(strZoijcleaow).kegysxyocb(iLereixgezr2).nuxfzjnpeb(iYggfygwlhe);
        if (strZoijcleaow.equals("audio/raw") && iJztzpxfvev != 0) {
            zoijcleaowVar.oipsdeybqn(iJztzpxfvev);
        }
        if (strZoijcleaow.equals("audio/mp4a-latm") && iLereixgezr3 > 0) {
            byte[] bArr = new byte[iLereixgezr3];
            yadqdtsiqtVar.draadjrbmk(bArr, 0, iLereixgezr3);
            zoijcleaowVar.metgxyhuhe(zdlpuopuiu.istkbnxepw(bArr));
        }
        return new lqeggnwhkg(zoijcleaowVar.cllcsxoeiz());
    }

    private static String iobyxmoadg(int i13) {
        switch (i13) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    private static iobyxmoadg ppxfxbqfkf(yadqdtsiqt yadqdtsiqtVar) {
        yadqdtsiqtVar.crxdokpmqz(4);
        int iYggfygwlhe = yadqdtsiqtVar.yggfygwlhe();
        int iYggfygwlhe2 = yadqdtsiqtVar.yggfygwlhe();
        yadqdtsiqtVar.crxdokpmqz(4);
        int iYggfygwlhe3 = yadqdtsiqtVar.yggfygwlhe();
        String strIobyxmoadg = iobyxmoadg(iYggfygwlhe3);
        if (strIobyxmoadg != null) {
            androidx.media3.common.iobyxmoadg.zoijcleaow zoijcleaowVar = new androidx.media3.common.iobyxmoadg.zoijcleaow();
            zoijcleaowVar.auzgnhcxok(iYggfygwlhe).okpsazkaxt(iYggfygwlhe2).zeieaojujs(strIobyxmoadg);
            return new lqeggnwhkg(zoijcleaowVar.cllcsxoeiz());
        }
        kcexrzcfyt.nufgyqmvbu("StreamFormatChunk", "Ignoring track with unsupported compression " + iYggfygwlhe3);
        return null;
    }

    public static iobyxmoadg wkgbmnqykc(int i13, yadqdtsiqt yadqdtsiqtVar) {
        if (i13 == 2) {
            return ppxfxbqfkf(yadqdtsiqtVar);
        }
        if (i13 == 1) {
            return eablkybsjg(yadqdtsiqtVar);
        }
        kcexrzcfyt.nufgyqmvbu("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + stevsuqkhv.bfopjjpdmp(i13));
        return null;
    }

    private static String zoijcleaow(int i13) {
        if (i13 == 1) {
            return "audio/raw";
        }
        if (i13 == 85) {
            return "audio/mpeg";
        }
        if (i13 == 255) {
            return "audio/mp4a-latm";
        }
        if (i13 == 8192) {
            return "audio/ac3";
        }
        if (i13 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    @Override // v3.iobyxmoadg
    public int getType() {
        return 1718776947;
    }
}
