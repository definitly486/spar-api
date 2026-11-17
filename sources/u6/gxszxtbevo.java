package u6;

import com.bumptech.glide.btonecajqb;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import kotlin.jvm.internal.zdlpuopuiu;
import l8.lqeggnwhkg;
import mj.kcexrzcfyt;
import r8.agtfadlqog;
import r8.ojitshcjhn;
import r8.oxmwwwfdhm;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo implements ojitshcjhn {

    public static final class iobyxmoadg implements agtfadlqog {

        /* JADX INFO: renamed from: u6.gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2786iobyxmoadg implements com.bumptech.glide.load.data.wkgbmnqykc {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ String f112746zdlpuopuiu;

            C2786iobyxmoadg(String str) {
                this.f112746zdlpuopuiu = str;
            }

            @Override // com.bumptech.glide.load.data.wkgbmnqykc
            public void cancel() {
            }

            @Override // com.bumptech.glide.load.data.wkgbmnqykc
            public void eablkybsjg(btonecajqb priority, com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg callback) {
                zdlpuopuiu.btonecajqb(priority, "priority");
                zdlpuopuiu.btonecajqb(callback, "callback");
                byte[] bytes = this.f112746zdlpuopuiu.getBytes(mj.wkgbmnqykc.f67326zoijcleaow);
                zdlpuopuiu.dxjokdxxww(bytes, "this as java.lang.String).getBytes(charset)");
                callback.gxszxtbevo(new ByteArrayInputStream(bytes));
            }

            @Override // com.bumptech.glide.load.data.wkgbmnqykc
            public Class iobyxmoadg() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.data.wkgbmnqykc
            public l8.iobyxmoadg wkgbmnqykc() {
                return l8.iobyxmoadg.LOCAL;
            }

            @Override // com.bumptech.glide.load.data.wkgbmnqykc
            public void zoijcleaow() {
            }
        }

        iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void eablkybsjg(String model, MessageDigest messageDigest) {
            zdlpuopuiu.btonecajqb(model, "$model");
            zdlpuopuiu.btonecajqb(messageDigest, "messageDigest");
            byte[] bytes = ("svg_string_" + model).getBytes(mj.wkgbmnqykc.f67326zoijcleaow);
            zdlpuopuiu.dxjokdxxww(bytes, "this as java.lang.String).getBytes(charset)");
            messageDigest.update(bytes);
        }

        @Override // r8.agtfadlqog
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(String model) {
            zdlpuopuiu.btonecajqb(model, "model");
            return kcexrzcfyt.sopmlzcsov(model, "<svg", false, 2, null);
        }

        @Override // r8.agtfadlqog
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public agtfadlqog.iobyxmoadg zoijcleaow(final String model, int i13, int i14, lqeggnwhkg options) {
            zdlpuopuiu.btonecajqb(model, "model");
            zdlpuopuiu.btonecajqb(options, "options");
            return new agtfadlqog.iobyxmoadg(new l8.eablkybsjg() { // from class: u6.eablkybsjg
                @Override // l8.eablkybsjg
                public final void zoijcleaow(MessageDigest messageDigest) {
                    gxszxtbevo.iobyxmoadg.eablkybsjg(model, messageDigest);
                }
            }, new C2786iobyxmoadg(model));
        }
    }

    @Override // r8.ojitshcjhn
    public void eablkybsjg() {
    }

    @Override // r8.ojitshcjhn
    public agtfadlqog wkgbmnqykc(oxmwwwfdhm multiFactory) {
        zdlpuopuiu.btonecajqb(multiFactory, "multiFactory");
        return new iobyxmoadg();
    }
}
