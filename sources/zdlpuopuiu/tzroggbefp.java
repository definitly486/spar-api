package zdlpuopuiu;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public class tzroggbefp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f129751iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iwizpuwonk.wflxmlrfwp f129754zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f129752ppxfxbqfkf = new HashMap();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f129753wkgbmnqykc = new HashMap();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Map f129750eablkybsjg = new HashMap();

    interface iobyxmoadg {
        StreamConfigurationMap iobyxmoadg();

        int[] ppxfxbqfkf();

        Size[] wkgbmnqykc(int i13);

        Size[] zoijcleaow(int i13);
    }

    private tzroggbefp(StreamConfigurationMap streamConfigurationMap, iwizpuwonk.wflxmlrfwp wflxmlrfwpVar) {
        this.f129751iobyxmoadg = new mbcevpiqjq(streamConfigurationMap);
        this.f129754zoijcleaow = wflxmlrfwpVar;
    }

    static tzroggbefp eablkybsjg(StreamConfigurationMap streamConfigurationMap, iwizpuwonk.wflxmlrfwp wflxmlrfwpVar) {
        return new tzroggbefp(streamConfigurationMap, wflxmlrfwpVar);
    }

    public Size[] iobyxmoadg(int i13) {
        if (this.f129753wkgbmnqykc.containsKey(Integer.valueOf(i13))) {
            if (((Size[]) this.f129753wkgbmnqykc.get(Integer.valueOf(i13))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) this.f129753wkgbmnqykc.get(Integer.valueOf(i13))).clone();
        }
        Size[] sizeArrWkgbmnqykc = this.f129751iobyxmoadg.wkgbmnqykc(i13);
        if (sizeArrWkgbmnqykc != null && sizeArrWkgbmnqykc.length > 0) {
            sizeArrWkgbmnqykc = this.f129754zoijcleaow.zoijcleaow(sizeArrWkgbmnqykc, i13);
        }
        this.f129753wkgbmnqykc.put(Integer.valueOf(i13), sizeArrWkgbmnqykc);
        if (sizeArrWkgbmnqykc != null) {
            return (Size[]) sizeArrWkgbmnqykc.clone();
        }
        return null;
    }

    public Size[] ppxfxbqfkf(int i13) {
        if (this.f129752ppxfxbqfkf.containsKey(Integer.valueOf(i13))) {
            if (((Size[]) this.f129752ppxfxbqfkf.get(Integer.valueOf(i13))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) this.f129752ppxfxbqfkf.get(Integer.valueOf(i13))).clone();
        }
        Size[] sizeArrZoijcleaow = this.f129751iobyxmoadg.zoijcleaow(i13);
        if (sizeArrZoijcleaow != null && sizeArrZoijcleaow.length != 0) {
            Size[] sizeArrZoijcleaow2 = this.f129754zoijcleaow.zoijcleaow(sizeArrZoijcleaow, i13);
            this.f129752ppxfxbqfkf.put(Integer.valueOf(i13), sizeArrZoijcleaow2);
            return (Size[]) sizeArrZoijcleaow2.clone();
        }
        sopmlzcsov.draadjrbmk("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i13);
        return sizeArrZoijcleaow;
    }

    public StreamConfigurationMap wkgbmnqykc() {
        return this.f129751iobyxmoadg.iobyxmoadg();
    }

    public int[] zoijcleaow() {
        int[] iArrPpxfxbqfkf = this.f129751iobyxmoadg.ppxfxbqfkf();
        if (iArrPpxfxbqfkf == null) {
            return null;
        }
        return (int[]) iArrPpxfxbqfkf.clone();
    }
}
