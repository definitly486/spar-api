package r8;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc implements agtfadlqog {

    private static final class iobyxmoadg implements com.bumptech.glide.load.data.wkgbmnqykc {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final File f82115zdlpuopuiu;

        iobyxmoadg(File file) {
            this.f82115zdlpuopuiu = file;
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void eablkybsjg(com.bumptech.glide.btonecajqb btonecajqbVar, com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
            try {
                iobyxmoadgVar.gxszxtbevo(g9.iobyxmoadg.iobyxmoadg(this.f82115zdlpuopuiu));
            } catch (IOException e13) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e13);
                }
                iobyxmoadgVar.ppxfxbqfkf(e13);
            }
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public Class iobyxmoadg() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public l8.iobyxmoadg wkgbmnqykc() {
            return l8.iobyxmoadg.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void zoijcleaow() {
        }
    }

    public static class zoijcleaow implements ojitshcjhn {
        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new wkgbmnqykc();
        }
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public agtfadlqog.iobyxmoadg zoijcleaow(File file, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        return new agtfadlqog.iobyxmoadg(new f9.wkgbmnqykc(file), new iobyxmoadg(file));
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(File file) {
        return true;
    }
}
