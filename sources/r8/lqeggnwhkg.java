package r8;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg implements agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f82075iobyxmoadg;

    public static class eablkybsjg extends iobyxmoadg {

        class iobyxmoadg implements wkgbmnqykc {
            iobyxmoadg() {
            }

            @Override // r8.lqeggnwhkg.wkgbmnqykc
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public InputStream ppxfxbqfkf(File file) {
                return new FileInputStream(file);
            }

            @Override // r8.lqeggnwhkg.wkgbmnqykc
            public Class iobyxmoadg() {
                return InputStream.class;
            }

            @Override // r8.lqeggnwhkg.wkgbmnqykc
            /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
            public void zoijcleaow(InputStream inputStream) throws IOException {
                inputStream.close();
            }
        }

        public eablkybsjg() {
            super(new iobyxmoadg());
        }
    }

    public static class iobyxmoadg implements ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final wkgbmnqykc f82076iobyxmoadg;

        public iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
            this.f82076iobyxmoadg = wkgbmnqykcVar;
        }

        @Override // r8.ojitshcjhn
        public final void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public final agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new lqeggnwhkg(this.f82076iobyxmoadg);
        }
    }

    private static final class ppxfxbqfkf implements com.bumptech.glide.load.data.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private Object f82077jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final wkgbmnqykc f82078yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final File f82079zdlpuopuiu;

        ppxfxbqfkf(File file, wkgbmnqykc wkgbmnqykcVar) {
            this.f82079zdlpuopuiu = file;
            this.f82078yggfygwlhe = wkgbmnqykcVar;
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void eablkybsjg(com.bumptech.glide.btonecajqb btonecajqbVar, com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
            try {
                Object objPpxfxbqfkf = this.f82078yggfygwlhe.ppxfxbqfkf(this.f82079zdlpuopuiu);
                this.f82077jyumaefscl = objPpxfxbqfkf;
                iobyxmoadgVar.gxszxtbevo(objPpxfxbqfkf);
            } catch (FileNotFoundException e13) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e13);
                }
                iobyxmoadgVar.ppxfxbqfkf(e13);
            }
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public Class iobyxmoadg() {
            return this.f82078yggfygwlhe.iobyxmoadg();
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public l8.iobyxmoadg wkgbmnqykc() {
            return l8.iobyxmoadg.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void zoijcleaow() {
            Object obj = this.f82077jyumaefscl;
            if (obj != null) {
                try {
                    this.f82078yggfygwlhe.zoijcleaow(obj);
                } catch (IOException unused) {
                }
            }
        }
    }

    public interface wkgbmnqykc {
        Class iobyxmoadg();

        Object ppxfxbqfkf(File file);

        void zoijcleaow(Object obj);
    }

    public static class zoijcleaow extends iobyxmoadg {

        class iobyxmoadg implements wkgbmnqykc {
            iobyxmoadg() {
            }

            @Override // r8.lqeggnwhkg.wkgbmnqykc
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor ppxfxbqfkf(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // r8.lqeggnwhkg.wkgbmnqykc
            public Class iobyxmoadg() {
                return ParcelFileDescriptor.class;
            }

            @Override // r8.lqeggnwhkg.wkgbmnqykc
            /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
            public void zoijcleaow(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }
        }

        public zoijcleaow() {
            super(new iobyxmoadg());
        }
    }

    public lqeggnwhkg(wkgbmnqykc wkgbmnqykcVar) {
        this.f82075iobyxmoadg = wkgbmnqykcVar;
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public agtfadlqog.iobyxmoadg zoijcleaow(File file, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        return new agtfadlqog.iobyxmoadg(new f9.wkgbmnqykc(file), new ppxfxbqfkf(file, this.f82075iobyxmoadg));
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(File file) {
        return true;
    }
}
