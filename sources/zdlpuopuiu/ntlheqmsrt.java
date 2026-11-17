package zdlpuopuiu;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
abstract class ntlheqmsrt implements tzroggbefp.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final StreamConfigurationMap f129731iobyxmoadg;

    static class iobyxmoadg {
        static Size[] iobyxmoadg(StreamConfigurationMap streamConfigurationMap, int i13) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i13);
        }
    }

    ntlheqmsrt(StreamConfigurationMap streamConfigurationMap) {
        this.f129731iobyxmoadg = streamConfigurationMap;
    }

    @Override // zdlpuopuiu.tzroggbefp.iobyxmoadg
    public StreamConfigurationMap iobyxmoadg() {
        return this.f129731iobyxmoadg;
    }

    @Override // zdlpuopuiu.tzroggbefp.iobyxmoadg
    public int[] ppxfxbqfkf() {
        try {
            return this.f129731iobyxmoadg.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e13) {
            sopmlzcsov.wflxmlrfwp("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e13);
            return null;
        }
    }

    @Override // zdlpuopuiu.tzroggbefp.iobyxmoadg
    public Size[] wkgbmnqykc(int i13) {
        return iobyxmoadg.iobyxmoadg(this.f129731iobyxmoadg, i13);
    }
}
