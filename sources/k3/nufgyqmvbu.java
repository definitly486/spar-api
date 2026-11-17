package k3;

import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final HashSet f53664iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private LoudnessCodecController f53665ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f53666zoijcleaow;

    class iobyxmoadg implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
        iobyxmoadg() {
        }

        public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            return nufgyqmvbu.this.f53666zoijcleaow.iobyxmoadg(bundle);
        }
    }

    public interface zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f53668iobyxmoadg = new zoijcleaow() { // from class: k3.dxjokdxxww
            @Override // k3.nufgyqmvbu.zoijcleaow
            public final Bundle iobyxmoadg(Bundle bundle) {
                return nufgyqmvbu.zoijcleaow.zoijcleaow(bundle);
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ Bundle zoijcleaow(Bundle bundle) {
            return bundle;
        }

        Bundle iobyxmoadg(Bundle bundle);
    }

    public nufgyqmvbu() {
        this(zoijcleaow.f53668iobyxmoadg);
    }

    public void eablkybsjg(int i13) {
        LoudnessCodecController loudnessCodecController = this.f53665ppxfxbqfkf;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f53665ppxfxbqfkf = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i13, com.google.common.util.concurrent.eablkybsjg.iobyxmoadg(), new iobyxmoadg());
        this.f53665ppxfxbqfkf = loudnessCodecControllerCreate;
        Iterator it = this.f53664iobyxmoadg.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public void ppxfxbqfkf() {
        this.f53664iobyxmoadg.clear();
        LoudnessCodecController loudnessCodecController = this.f53665ppxfxbqfkf;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void wkgbmnqykc(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f53664iobyxmoadg.remove(mediaCodec) || (loudnessCodecController = this.f53665ppxfxbqfkf) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void zoijcleaow(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f53665ppxfxbqfkf;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            y2.iobyxmoadg.lqeggnwhkg(this.f53664iobyxmoadg.add(mediaCodec));
        }
    }

    public nufgyqmvbu(zoijcleaow zoijcleaowVar) {
        this.f53664iobyxmoadg = new HashSet();
        this.f53666zoijcleaow = zoijcleaowVar;
    }
}
