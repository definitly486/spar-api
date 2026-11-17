package jd0;

import gg.wwaezpbzkn;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zdlpuopuiu extends df.wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final wkgbmnqykc f51142eablkybsjg = new wkgbmnqykc(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final ppxfxbqfkf f51143gxszxtbevo = new ppxfxbqfkf();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tg.draadjrbmk f51144ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final tg.draadjrbmk f51145wkgbmnqykc;

    /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        iobyxmoadg(Object obj) {
            super(1, obj, zdlpuopuiu.class, "onDeleteCardClick", "onDeleteCardClick(Lru/myspar/legacy/presentation/screen/savedcards/models/CardItemUiModel;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ld0.iobyxmoadg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ld0.iobyxmoadg p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            ((zdlpuopuiu) this.receiver).nufgyqmvbu(p13);
        }
    }

    public static final class ppxfxbqfkf extends w30.iobyxmoadg {
        ppxfxbqfkf() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public Object ppxfxbqfkf(w30.ppxfxbqfkf oldItem, w30.ppxfxbqfkf newItem) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newItem, "newItem");
            ArrayList arrayList = new ArrayList();
            if ((oldItem instanceof ld0.ppxfxbqfkf) && (newItem instanceof ld0.ppxfxbqfkf) && ((ld0.ppxfxbqfkf) oldItem).lqeggnwhkg() != ((ld0.ppxfxbqfkf) newItem).lqeggnwhkg()) {
                arrayList.add(nufgyqmvbu.iobyxmoadg.f51134iobyxmoadg);
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    public static final class wkgbmnqykc {
        public /* synthetic */ wkgbmnqykc(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private wkgbmnqykc() {
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        zoijcleaow(Object obj) {
            super(1, obj, zdlpuopuiu.class, "onQuestionClick", "onQuestionClick(Lru/myspar/legacy/presentation/screen/savedcards/models/QuestionItemUiModel;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ld0.ppxfxbqfkf) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ld0.ppxfxbqfkf p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            ((zdlpuopuiu) this.receiver).dxjokdxxww(p13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdlpuopuiu(tg.draadjrbmk questionClickListener, tg.draadjrbmk onDeleteListener) {
        super(f51143gxszxtbevo);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(questionClickListener, "questionClickListener");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onDeleteListener, "onDeleteListener");
        this.f51144ppxfxbqfkf = questionClickListener;
        this.f51145wkgbmnqykc = onDeleteListener;
        this.f27903iobyxmoadg.ppxfxbqfkf(lqeggnwhkg.eablkybsjg(new iobyxmoadg(this))).ppxfxbqfkf(iwizpuwonk.ppxfxbqfkf()).ppxfxbqfkf(agtfadlqog.gxszxtbevo(new zoijcleaow(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dxjokdxxww(ld0.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f51144ppxfxbqfkf.invoke(ppxfxbqfkfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nufgyqmvbu(ld0.iobyxmoadg iobyxmoadgVar) {
        this.f51145wkgbmnqykc.invoke(iobyxmoadgVar);
    }
}
