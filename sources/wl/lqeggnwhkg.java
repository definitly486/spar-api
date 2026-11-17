package wl;

import java.io.IOException;
import org.jsoup.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lqeggnwhkg {

    static final class ppxfxbqfkf extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final StringBuilder f120183iobyxmoadg;

        @Override // wl.lqeggnwhkg
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public ppxfxbqfkf iobyxmoadg(char c13) {
            this.f120183iobyxmoadg.append(c13);
            return this;
        }

        @Override // wl.lqeggnwhkg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public ppxfxbqfkf zoijcleaow(CharSequence charSequence) {
            this.f120183iobyxmoadg.append(charSequence);
            return this;
        }

        @Override // wl.lqeggnwhkg
        public lqeggnwhkg ppxfxbqfkf(char[] cArr, int i13, int i14) {
            this.f120183iobyxmoadg.append(cArr, i13, i14);
            return this;
        }

        public String toString() {
            return this.f120183iobyxmoadg.toString();
        }

        private ppxfxbqfkf(StringBuilder sb3) {
            this.f120183iobyxmoadg = sb3;
        }
    }

    static final class zoijcleaow extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Appendable f120184iobyxmoadg;

        /* JADX INFO: Access modifiers changed from: private */
        interface iobyxmoadg {
            void iobyxmoadg();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void btonecajqb(CharSequence charSequence) throws IOException {
            this.f120184iobyxmoadg.append(charSequence);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void draadjrbmk(char[] cArr, int i13, int i14) throws IOException {
            this.f120184iobyxmoadg.append(new String(cArr, i13, i14));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void gtknphoqwx(char c13) throws IOException {
            this.f120184iobyxmoadg.append(c13);
        }

        private zoijcleaow wflxmlrfwp(iobyxmoadg iobyxmoadgVar) {
            try {
                iobyxmoadgVar.iobyxmoadg();
                return this;
            } catch (IOException e13) {
                throw new SerializationException(e13);
            }
        }

        @Override // wl.lqeggnwhkg
        /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
        public zoijcleaow zoijcleaow(final CharSequence charSequence) {
            return wflxmlrfwp(new iobyxmoadg() { // from class: wl.btonecajqb
                @Override // wl.lqeggnwhkg.zoijcleaow.iobyxmoadg
                public final void iobyxmoadg() throws IOException {
                    this.f120164iobyxmoadg.btonecajqb(charSequence);
                }
            });
        }

        @Override // wl.lqeggnwhkg
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public zoijcleaow iobyxmoadg(final char c13) {
            return wflxmlrfwp(new iobyxmoadg() { // from class: wl.nufgyqmvbu
                @Override // wl.lqeggnwhkg.zoijcleaow.iobyxmoadg
                public final void iobyxmoadg() throws IOException {
                    this.f120185iobyxmoadg.gtknphoqwx(c13);
                }
            });
        }

        @Override // wl.lqeggnwhkg
        public lqeggnwhkg ppxfxbqfkf(final char[] cArr, final int i13, final int i14) {
            return wflxmlrfwp(new iobyxmoadg() { // from class: wl.dxjokdxxww
                @Override // wl.lqeggnwhkg.zoijcleaow.iobyxmoadg
                public final void iobyxmoadg() throws IOException {
                    this.f120166iobyxmoadg.draadjrbmk(cArr, i13, i14);
                }
            });
        }

        private zoijcleaow(Appendable appendable) {
            this.f120184iobyxmoadg = appendable;
        }
    }

    public static lqeggnwhkg wkgbmnqykc(Appendable appendable) {
        return appendable instanceof StringBuilder ? new ppxfxbqfkf((StringBuilder) appendable) : new zoijcleaow(appendable);
    }

    public abstract lqeggnwhkg iobyxmoadg(char c13);

    public abstract lqeggnwhkg ppxfxbqfkf(char[] cArr, int i13, int i14);

    public abstract lqeggnwhkg zoijcleaow(CharSequence charSequence);
}
