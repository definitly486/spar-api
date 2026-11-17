package r8;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class eablkybsjg implements agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f82035iobyxmoadg;

    public interface iobyxmoadg {
        Class iobyxmoadg();

        Object ppxfxbqfkf(String str);

        void zoijcleaow(Object obj);
    }

    public static final class ppxfxbqfkf implements ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final iobyxmoadg f82036iobyxmoadg = new iobyxmoadg();

        class iobyxmoadg implements iobyxmoadg {
            iobyxmoadg() {
            }

            @Override // r8.eablkybsjg.iobyxmoadg
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public InputStream ppxfxbqfkf(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }

            @Override // r8.eablkybsjg.iobyxmoadg
            public Class iobyxmoadg() {
                return InputStream.class;
            }

            @Override // r8.eablkybsjg.iobyxmoadg
            /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
            public void zoijcleaow(InputStream inputStream) throws IOException {
                inputStream.close();
            }
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new eablkybsjg(this.f82036iobyxmoadg);
        }
    }

    private static final class zoijcleaow implements com.bumptech.glide.load.data.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private Object f82038jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final iobyxmoadg f82039yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f82040zdlpuopuiu;

        zoijcleaow(String str, iobyxmoadg iobyxmoadgVar) {
            this.f82040zdlpuopuiu = str;
            this.f82039yggfygwlhe = iobyxmoadgVar;
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void eablkybsjg(com.bumptech.glide.btonecajqb btonecajqbVar, com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
            try {
                Object objPpxfxbqfkf = this.f82039yggfygwlhe.ppxfxbqfkf(this.f82040zdlpuopuiu);
                this.f82038jyumaefscl = objPpxfxbqfkf;
                iobyxmoadgVar.gxszxtbevo(objPpxfxbqfkf);
            } catch (IllegalArgumentException e13) {
                iobyxmoadgVar.ppxfxbqfkf(e13);
            }
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public Class iobyxmoadg() {
            return this.f82039yggfygwlhe.iobyxmoadg();
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public l8.iobyxmoadg wkgbmnqykc() {
            return l8.iobyxmoadg.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void zoijcleaow() {
            try {
                this.f82039yggfygwlhe.zoijcleaow(this.f82038jyumaefscl);
            } catch (IOException unused) {
            }
        }
    }

    public eablkybsjg(iobyxmoadg iobyxmoadgVar) {
        this.f82035iobyxmoadg = iobyxmoadgVar;
    }

    @Override // r8.agtfadlqog
    public boolean iobyxmoadg(Object obj) {
        return obj.toString().startsWith("data:image");
    }

    @Override // r8.agtfadlqog
    public agtfadlqog.iobyxmoadg zoijcleaow(Object obj, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        return new agtfadlqog.iobyxmoadg(new f9.wkgbmnqykc(obj), new zoijcleaow(obj.toString(), this.f82035iobyxmoadg));
    }
}
