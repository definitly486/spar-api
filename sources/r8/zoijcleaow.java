package r8;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow implements agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final InterfaceC1834zoijcleaow f82121iobyxmoadg;

    public static class iobyxmoadg implements ojitshcjhn {

        /* JADX INFO: renamed from: r8.zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class C1833iobyxmoadg implements InterfaceC1834zoijcleaow {
            C1833iobyxmoadg() {
            }

            @Override // r8.zoijcleaow.InterfaceC1834zoijcleaow
            public Class iobyxmoadg() {
                return ByteBuffer.class;
            }

            @Override // r8.zoijcleaow.InterfaceC1834zoijcleaow
            /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
            public ByteBuffer zoijcleaow(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new zoijcleaow(new C1833iobyxmoadg());
        }
    }

    private static class ppxfxbqfkf implements com.bumptech.glide.load.data.wkgbmnqykc {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final InterfaceC1834zoijcleaow f82123yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final byte[] f82124zdlpuopuiu;

        ppxfxbqfkf(byte[] bArr, InterfaceC1834zoijcleaow interfaceC1834zoijcleaow) {
            this.f82124zdlpuopuiu = bArr;
            this.f82123yggfygwlhe = interfaceC1834zoijcleaow;
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void eablkybsjg(com.bumptech.glide.btonecajqb btonecajqbVar, com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
            iobyxmoadgVar.gxszxtbevo(this.f82123yggfygwlhe.zoijcleaow(this.f82124zdlpuopuiu));
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public Class iobyxmoadg() {
            return this.f82123yggfygwlhe.iobyxmoadg();
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public l8.iobyxmoadg wkgbmnqykc() {
            return l8.iobyxmoadg.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void zoijcleaow() {
        }
    }

    public static class wkgbmnqykc implements ojitshcjhn {

        class iobyxmoadg implements InterfaceC1834zoijcleaow {
            iobyxmoadg() {
            }

            @Override // r8.zoijcleaow.InterfaceC1834zoijcleaow
            public Class iobyxmoadg() {
                return InputStream.class;
            }

            @Override // r8.zoijcleaow.InterfaceC1834zoijcleaow
            /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
            public InputStream zoijcleaow(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new zoijcleaow(new iobyxmoadg());
        }
    }

    /* JADX INFO: renamed from: r8.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public interface InterfaceC1834zoijcleaow {
        Class iobyxmoadg();

        Object zoijcleaow(byte[] bArr);
    }

    public zoijcleaow(InterfaceC1834zoijcleaow interfaceC1834zoijcleaow) {
        this.f82121iobyxmoadg = interfaceC1834zoijcleaow;
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public agtfadlqog.iobyxmoadg zoijcleaow(byte[] bArr, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        return new agtfadlqog.iobyxmoadg(new f9.wkgbmnqykc(bArr), new ppxfxbqfkf(bArr, this.f82121iobyxmoadg));
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(byte[] bArr) {
        return true;
    }
}
