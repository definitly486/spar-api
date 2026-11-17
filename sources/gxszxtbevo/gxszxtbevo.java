package gxszxtbevo;

import android.content.Context;
import android.content.Intent;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import hg.agtfadlqog;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo extends gxszxtbevo.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f38658iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final Intent iobyxmoadg(String[] input) {
            zdlpuopuiu.btonecajqb(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            zdlpuopuiu.dxjokdxxww(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }

        private iobyxmoadg() {
        }
    }

    @Override // gxszxtbevo.iobyxmoadg
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo.iobyxmoadg.C0890iobyxmoadg zoijcleaow(Context context, String[] input) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(input, "input");
        if (input.length == 0) {
            return new gxszxtbevo.iobyxmoadg.C0890iobyxmoadg(tzroggbefp.dxjokdxxww());
        }
        for (String str : input) {
            if (androidx.core.content.iobyxmoadg.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(tzroggbefp.eablkybsjg(input.length), 16));
        for (String str2 : input) {
            vdvldrhtss vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(str2, Boolean.TRUE);
            linkedHashMap.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
        }
        return new gxszxtbevo.iobyxmoadg.C0890iobyxmoadg(linkedHashMap);
    }

    @Override // gxszxtbevo.iobyxmoadg
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public Map ppxfxbqfkf(int i13, Intent intent) {
        if (i13 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return tzroggbefp.dxjokdxxww();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i14 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i14 == 0));
            }
            return tzroggbefp.kcexrzcfyt(jyumaefscl.w(agtfadlqog.metgxyhuhe(stringArrayExtra), arrayList));
        }
        return tzroggbefp.dxjokdxxww();
    }

    @Override // gxszxtbevo.iobyxmoadg
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Intent iobyxmoadg(Context context, String[] input) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(input, "input");
        return f38658iobyxmoadg.iobyxmoadg(input);
    }
}
