package ff;

import bk.agtfadlqog;
import bk.draadjrbmk;
import bk.ojitshcjhn;
import bk.oxmwwwfdhm;
import java.lang.reflect.Type;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cqumvgiudr;
import lk.istkbnxepw;
import lk.yadqdtsiqt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final oxmwwwfdhm f33537iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(oxmwwwfdhm format) {
            super(null);
            zdlpuopuiu.btonecajqb(format, "format");
            this.f33537iobyxmoadg = format;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ff.eablkybsjg
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public oxmwwwfdhm zoijcleaow() {
            return this.f33537iobyxmoadg;
        }

        @Override // ff.eablkybsjg
        public Object iobyxmoadg(bk.iobyxmoadg loader, yadqdtsiqt body) {
            zdlpuopuiu.btonecajqb(loader, "loader");
            zdlpuopuiu.btonecajqb(body, "body");
            String strAgtfadlqog = body.agtfadlqog();
            zdlpuopuiu.dxjokdxxww(strAgtfadlqog, "body.string()");
            return zoijcleaow().ppxfxbqfkf(loader, strAgtfadlqog);
        }

        @Override // ff.eablkybsjg
        public istkbnxepw wkgbmnqykc(cqumvgiudr contentType, agtfadlqog saver, Object obj) {
            zdlpuopuiu.btonecajqb(contentType, "contentType");
            zdlpuopuiu.btonecajqb(saver, "saver");
            istkbnxepw istkbnxepwVarWkgbmnqykc = istkbnxepw.wkgbmnqykc(contentType, zoijcleaow().zoijcleaow(saver, obj));
            zdlpuopuiu.dxjokdxxww(istkbnxepwVarWkgbmnqykc, "create(contentType, string)");
            return istkbnxepwVarWkgbmnqykc;
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public abstract Object iobyxmoadg(bk.iobyxmoadg iobyxmoadgVar, yadqdtsiqt yadqdtsiqtVar);

    public final bk.zoijcleaow ppxfxbqfkf(Type type) {
        zdlpuopuiu.btonecajqb(type, "type");
        return ojitshcjhn.zoijcleaow(zoijcleaow().iobyxmoadg(), type);
    }

    public abstract istkbnxepw wkgbmnqykc(cqumvgiudr cqumvgiudrVar, agtfadlqog agtfadlqogVar, Object obj);

    protected abstract draadjrbmk zoijcleaow();

    private eablkybsjg() {
    }
}
