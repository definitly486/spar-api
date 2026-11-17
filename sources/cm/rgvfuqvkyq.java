package cm;

import java.io.DataOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.zone.ZoneRulesException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rgvfuqvkyq implements Serializable {
    private static final long serialVersionUID = 8352817235686L;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final Map f20149yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final gm.btonecajqb f20150zdlpuopuiu = new iobyxmoadg();

    class iobyxmoadg implements gm.btonecajqb {
        iobyxmoadg() {
        }

        @Override // gm.btonecajqb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public rgvfuqvkyq iobyxmoadg(gm.eablkybsjg eablkybsjgVar) {
            return rgvfuqvkyq.vdvldrhtss(eablkybsjgVar);
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("ACT", "Australia/Darwin");
        map.put("AET", "Australia/Sydney");
        map.put("AGT", "America/Argentina/Buenos_Aires");
        map.put("ART", "Africa/Cairo");
        map.put("AST", "America/Anchorage");
        map.put("BET", "America/Sao_Paulo");
        map.put("BST", "Asia/Dhaka");
        map.put("CAT", "Africa/Harare");
        map.put("CNT", "America/St_Johns");
        map.put("CST", "America/Chicago");
        map.put("CTT", "Asia/Shanghai");
        map.put("EAT", "Africa/Addis_Ababa");
        map.put("ECT", "Europe/Paris");
        map.put("IET", "America/Indiana/Indianapolis");
        map.put("IST", "Asia/Kolkata");
        map.put("JST", "Asia/Tokyo");
        map.put("MIT", "Pacific/Apia");
        map.put("NET", "Asia/Yerevan");
        map.put("NST", "Pacific/Auckland");
        map.put("PLT", "Asia/Karachi");
        map.put("PNT", "America/Phoenix");
        map.put("PRT", "America/Puerto_Rico");
        map.put("PST", "America/Los_Angeles");
        map.put("SST", "Pacific/Guadalcanal");
        map.put("VST", "Asia/Ho_Chi_Minh");
        map.put("EST", "-05:00");
        map.put("MST", "-07:00");
        map.put("HST", "-10:00");
        f20149yggfygwlhe = Collections.unmodifiableMap(map);
    }

    rgvfuqvkyq() {
        if (getClass() != vdvldrhtss.class && getClass() != oxmwwwfdhm.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static rgvfuqvkyq cqumvgiudr(String str) {
        fm.ppxfxbqfkf.dxjokdxxww(str, "zoneId");
        if (str.equals("Z")) {
            return vdvldrhtss.f20155pmvmpeiblj;
        }
        if (str.length() == 1) {
            throw new DateTimeException("Invalid zone: " + str);
        }
        if (str.startsWith("+") || str.startsWith("-")) {
            return vdvldrhtss.wwaezpbzkn(str);
        }
        if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
            return new oxmwwwfdhm(str, vdvldrhtss.f20155pmvmpeiblj.zdlpuopuiu());
        }
        if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
            vdvldrhtss vdvldrhtssVarWwaezpbzkn = vdvldrhtss.wwaezpbzkn(str.substring(3));
            if (vdvldrhtssVarWwaezpbzkn.lmojexxdyd() == 0) {
                return new oxmwwwfdhm(str.substring(0, 3), vdvldrhtssVarWwaezpbzkn.zdlpuopuiu());
            }
            return new oxmwwwfdhm(str.substring(0, 3) + vdvldrhtssVarWwaezpbzkn.kcexrzcfyt(), vdvldrhtssVarWwaezpbzkn.zdlpuopuiu());
        }
        if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
            return oxmwwwfdhm.istkbnxepw(str, true);
        }
        vdvldrhtss vdvldrhtssVarWwaezpbzkn2 = vdvldrhtss.wwaezpbzkn(str.substring(2));
        if (vdvldrhtssVarWwaezpbzkn2.lmojexxdyd() == 0) {
            return new oxmwwwfdhm("UT", vdvldrhtssVarWwaezpbzkn2.zdlpuopuiu());
        }
        return new oxmwwwfdhm("UT" + vdvldrhtssVarWwaezpbzkn2.kcexrzcfyt(), vdvldrhtssVarWwaezpbzkn2.zdlpuopuiu());
    }

    public static rgvfuqvkyq lereixgezr(String str, Map map) {
        fm.ppxfxbqfkf.dxjokdxxww(str, "zoneId");
        fm.ppxfxbqfkf.dxjokdxxww(map, "aliasMap");
        String str2 = (String) map.get(str);
        if (str2 != null) {
            str = str2;
        }
        return cqumvgiudr(str);
    }

    public static rgvfuqvkyq pmvmpeiblj() {
        return lereixgezr(TimeZone.getDefault().getID(), f20149yggfygwlhe);
    }

    public static rgvfuqvkyq vdvldrhtss(gm.eablkybsjg eablkybsjgVar) {
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) eablkybsjgVar.btonecajqb(gm.dxjokdxxww.gxszxtbevo());
        if (rgvfuqvkyqVar != null) {
            return rgvfuqvkyqVar;
        }
        throw new DateTimeException("Unable to obtain ZoneId from TemporalAccessor: " + eablkybsjgVar + ", type " + eablkybsjgVar.getClass().getName());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rgvfuqvkyq) {
            return kcexrzcfyt().equals(((rgvfuqvkyq) obj).kcexrzcfyt());
        }
        return false;
    }

    public int hashCode() {
        return kcexrzcfyt().hashCode();
    }

    public rgvfuqvkyq jyumaefscl() {
        try {
            hm.gxszxtbevo gxszxtbevoVarZdlpuopuiu = zdlpuopuiu();
            if (gxszxtbevoVarZdlpuopuiu.dxjokdxxww()) {
                return gxszxtbevoVarZdlpuopuiu.iobyxmoadg(wkgbmnqykc.f20164jyumaefscl);
            }
        } catch (ZoneRulesException unused) {
        }
        return this;
    }

    public abstract String kcexrzcfyt();

    public String toString() {
        return kcexrzcfyt();
    }

    public abstract hm.gxszxtbevo zdlpuopuiu();

    abstract void zynmafqrjb(DataOutput dataOutput);
}
