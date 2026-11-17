package g2;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.kcexrzcfyt;
import d2.btonecajqb;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final nufgyqmvbu f35837iobyxmoadg = new nufgyqmvbu();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final String f35838zoijcleaow = "preferences_pb";

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f35839iobyxmoadg;

        static {
            int[] iArr = new int[f2.nufgyqmvbu.zoijcleaow.values().length];
            iArr[f2.nufgyqmvbu.zoijcleaow.BOOLEAN.ordinal()] = 1;
            iArr[f2.nufgyqmvbu.zoijcleaow.FLOAT.ordinal()] = 2;
            iArr[f2.nufgyqmvbu.zoijcleaow.DOUBLE.ordinal()] = 3;
            iArr[f2.nufgyqmvbu.zoijcleaow.INTEGER.ordinal()] = 4;
            iArr[f2.nufgyqmvbu.zoijcleaow.LONG.ordinal()] = 5;
            iArr[f2.nufgyqmvbu.zoijcleaow.STRING.ordinal()] = 6;
            iArr[f2.nufgyqmvbu.zoijcleaow.STRING_SET.ordinal()] = 7;
            iArr[f2.nufgyqmvbu.zoijcleaow.VALUE_NOT_SET.ordinal()] = 8;
            f35839iobyxmoadg = iArr;
        }
    }

    private nufgyqmvbu() {
    }

    private final f2.nufgyqmvbu gxszxtbevo(Object obj) {
        if (obj instanceof Boolean) {
            kcexrzcfyt kcexrzcfytVarLqeggnwhkg = f2.nufgyqmvbu.mbcevpiqjq().vdvldrhtss(((Boolean) obj).booleanValue()).lqeggnwhkg();
            zdlpuopuiu.dxjokdxxww(kcexrzcfytVarLqeggnwhkg, "newBuilder().setBoolean(value).build()");
            return (f2.nufgyqmvbu) kcexrzcfytVarLqeggnwhkg;
        }
        if (obj instanceof Float) {
            kcexrzcfyt kcexrzcfytVarLqeggnwhkg2 = f2.nufgyqmvbu.mbcevpiqjq().kcexrzcfyt(((Number) obj).floatValue()).lqeggnwhkg();
            zdlpuopuiu.dxjokdxxww(kcexrzcfytVarLqeggnwhkg2, "newBuilder().setFloat(value).build()");
            return (f2.nufgyqmvbu) kcexrzcfytVarLqeggnwhkg2;
        }
        if (obj instanceof Double) {
            kcexrzcfyt kcexrzcfytVarLqeggnwhkg3 = f2.nufgyqmvbu.mbcevpiqjq().oxmwwwfdhm(((Number) obj).doubleValue()).lqeggnwhkg();
            zdlpuopuiu.dxjokdxxww(kcexrzcfytVarLqeggnwhkg3, "newBuilder().setDouble(value).build()");
            return (f2.nufgyqmvbu) kcexrzcfytVarLqeggnwhkg3;
        }
        if (obj instanceof Integer) {
            kcexrzcfyt kcexrzcfytVarLqeggnwhkg4 = f2.nufgyqmvbu.mbcevpiqjq().zdlpuopuiu(((Number) obj).intValue()).lqeggnwhkg();
            zdlpuopuiu.dxjokdxxww(kcexrzcfytVarLqeggnwhkg4, "newBuilder().setInteger(value).build()");
            return (f2.nufgyqmvbu) kcexrzcfytVarLqeggnwhkg4;
        }
        if (obj instanceof Long) {
            kcexrzcfyt kcexrzcfytVarLqeggnwhkg5 = f2.nufgyqmvbu.mbcevpiqjq().yggfygwlhe(((Number) obj).longValue()).lqeggnwhkg();
            zdlpuopuiu.dxjokdxxww(kcexrzcfytVarLqeggnwhkg5, "newBuilder().setLong(value).build()");
            return (f2.nufgyqmvbu) kcexrzcfytVarLqeggnwhkg5;
        }
        if (obj instanceof String) {
            kcexrzcfyt kcexrzcfytVarLqeggnwhkg6 = f2.nufgyqmvbu.mbcevpiqjq().jyumaefscl((String) obj).lqeggnwhkg();
            zdlpuopuiu.dxjokdxxww(kcexrzcfytVarLqeggnwhkg6, "newBuilder().setString(value).build()");
            return (f2.nufgyqmvbu) kcexrzcfytVarLqeggnwhkg6;
        }
        if (!(obj instanceof Set)) {
            throw new IllegalStateException(zdlpuopuiu.oxmwwwfdhm("PreferencesSerializer does not support type: ", obj.getClass().getName()));
        }
        kcexrzcfyt kcexrzcfytVarLqeggnwhkg7 = f2.nufgyqmvbu.mbcevpiqjq().iwizpuwonk(f2.lqeggnwhkg.ylkuphrtab().vdvldrhtss((Set) obj)).lqeggnwhkg();
        zdlpuopuiu.dxjokdxxww(kcexrzcfytVarLqeggnwhkg7, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
        return (f2.nufgyqmvbu) kcexrzcfytVarLqeggnwhkg7;
    }

    private final void ppxfxbqfkf(String str, f2.nufgyqmvbu nufgyqmvbuVar, g2.iobyxmoadg iobyxmoadgVar) throws CorruptionException {
        f2.nufgyqmvbu.zoijcleaow zoijcleaowVarTzroggbefp = nufgyqmvbuVar.tzroggbefp();
        switch (zoijcleaowVarTzroggbefp == null ? -1 : iobyxmoadg.f35839iobyxmoadg[zoijcleaowVarTzroggbefp.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                iobyxmoadgVar.dxjokdxxww(gxszxtbevo.iobyxmoadg(str), Boolean.valueOf(nufgyqmvbuVar.hcddaimhww()));
                return;
            case 2:
                iobyxmoadgVar.dxjokdxxww(gxszxtbevo.ppxfxbqfkf(str), Float.valueOf(nufgyqmvbuVar.cllcsxoeiz()));
                return;
            case 3:
                iobyxmoadgVar.dxjokdxxww(gxszxtbevo.zoijcleaow(str), Double.valueOf(nufgyqmvbuVar.hkdspvbjdz()));
                return;
            case 4:
                iobyxmoadgVar.dxjokdxxww(gxszxtbevo.wkgbmnqykc(str), Integer.valueOf(nufgyqmvbuVar.dsvhmnatus()));
                return;
            case 5:
                iobyxmoadgVar.dxjokdxxww(gxszxtbevo.eablkybsjg(str), Long.valueOf(nufgyqmvbuVar.wypolnanlu()));
                return;
            case 6:
                wkgbmnqykc.iobyxmoadg iobyxmoadgVarGxszxtbevo = gxszxtbevo.gxszxtbevo(str);
                String strStevsuqkhv = nufgyqmvbuVar.stevsuqkhv();
                zdlpuopuiu.dxjokdxxww(strStevsuqkhv, "value.string");
                iobyxmoadgVar.dxjokdxxww(iobyxmoadgVarGxszxtbevo, strStevsuqkhv);
                return;
            case 7:
                wkgbmnqykc.iobyxmoadg iobyxmoadgVarLqeggnwhkg = gxszxtbevo.lqeggnwhkg(str);
                List listLmojexxdyd = nufgyqmvbuVar.kegysxyocb().lmojexxdyd();
                zdlpuopuiu.dxjokdxxww(listLmojexxdyd, "value.stringSet.stringsList");
                iobyxmoadgVar.dxjokdxxww(iobyxmoadgVarLqeggnwhkg, jyumaefscl.r(listLmojexxdyd));
                return;
            case 8:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    public final String eablkybsjg() {
        return f35838zoijcleaow;
    }

    @Override // d2.btonecajqb
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, OutputStream outputStream, lg.gxszxtbevo gxszxtbevoVar) {
        Map mapIobyxmoadg = wkgbmnqykcVar.iobyxmoadg();
        f2.gxszxtbevo.iobyxmoadg iobyxmoadgVarYlkuphrtab = f2.gxszxtbevo.ylkuphrtab();
        for (Map.Entry entry : mapIobyxmoadg.entrySet()) {
            iobyxmoadgVarYlkuphrtab.vdvldrhtss(((wkgbmnqykc.iobyxmoadg) entry.getKey()).iobyxmoadg(), gxszxtbevo(entry.getValue()));
        }
        ((f2.gxszxtbevo) iobyxmoadgVarYlkuphrtab.lqeggnwhkg()).lqeggnwhkg(outputStream);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // d2.btonecajqb
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public wkgbmnqykc getDefaultValue() {
        return eablkybsjg.iobyxmoadg();
    }

    @Override // d2.btonecajqb
    public Object zoijcleaow(InputStream inputStream, lg.gxszxtbevo gxszxtbevoVar) throws CorruptionException {
        f2.gxszxtbevo gxszxtbevoVarIobyxmoadg = f2.wkgbmnqykc.f32597iobyxmoadg.iobyxmoadg(inputStream);
        g2.iobyxmoadg iobyxmoadgVarZoijcleaow = eablkybsjg.zoijcleaow(new wkgbmnqykc.zoijcleaow[0]);
        Map mapYadqdtsiqt = gxszxtbevoVarIobyxmoadg.yadqdtsiqt();
        zdlpuopuiu.dxjokdxxww(mapYadqdtsiqt, "preferencesProto.preferencesMap");
        for (Map.Entry entry : mapYadqdtsiqt.entrySet()) {
            String name = (String) entry.getKey();
            f2.nufgyqmvbu value = (f2.nufgyqmvbu) entry.getValue();
            nufgyqmvbu nufgyqmvbuVar = f35837iobyxmoadg;
            zdlpuopuiu.dxjokdxxww(name, "name");
            zdlpuopuiu.dxjokdxxww(value, "value");
            nufgyqmvbuVar.ppxfxbqfkf(name, value, iobyxmoadgVarZoijcleaow);
        }
        return iobyxmoadgVarZoijcleaow.wkgbmnqykc();
    }
}
