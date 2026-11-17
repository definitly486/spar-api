package v1;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class metgxyhuhe {

    public static final class iobyxmoadg implements lj.btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ViewGroup f115161iobyxmoadg;

        iobyxmoadg(ViewGroup viewGroup) {
            this.f115161iobyxmoadg = viewGroup;
        }

        @Override // lj.btonecajqb
        public Iterator iterator() {
            return metgxyhuhe.ppxfxbqfkf(this.f115161iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ViewGroup f115162yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f115163zdlpuopuiu;

        ppxfxbqfkf(ViewGroup viewGroup) {
            this.f115162yggfygwlhe = viewGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f115163zdlpuopuiu < this.f115162yggfygwlhe.getChildCount();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f115162yggfygwlhe;
            int i13 = this.f115163zdlpuopuiu;
            this.f115163zdlpuopuiu = i13 + 1;
            View childAt = viewGroup.getChildAt(i13);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f115162yggfygwlhe;
            int i13 = this.f115163zdlpuopuiu - 1;
            this.f115163zdlpuopuiu = i13;
            viewGroup.removeViewAt(i13);
        }
    }

    public static final class wkgbmnqykc implements lj.btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ViewGroup f115164iobyxmoadg;

        public wkgbmnqykc(ViewGroup viewGroup) {
            this.f115164iobyxmoadg = viewGroup;
        }

        @Override // lj.btonecajqb
        public Iterator iterator() {
            return new crxdokpmqz(metgxyhuhe.iobyxmoadg(this.f115164iobyxmoadg).iterator(), zoijcleaow.f115165zdlpuopuiu);
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f115165zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(View view) {
            lj.btonecajqb btonecajqbVarIobyxmoadg;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (btonecajqbVarIobyxmoadg = metgxyhuhe.iobyxmoadg(viewGroup)) == null) {
                return null;
            }
            return btonecajqbVarIobyxmoadg.iterator();
        }
    }

    public static final lj.btonecajqb iobyxmoadg(ViewGroup viewGroup) {
        return new iobyxmoadg(viewGroup);
    }

    public static final Iterator ppxfxbqfkf(ViewGroup viewGroup) {
        return new ppxfxbqfkf(viewGroup);
    }

    public static final lj.btonecajqb zoijcleaow(ViewGroup viewGroup) {
        return new wkgbmnqykc(viewGroup);
    }
}
