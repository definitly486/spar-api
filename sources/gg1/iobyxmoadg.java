package gg1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends df.wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final RecyclerView.jyumaefscl f37171ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final zoijcleaow f37170wkgbmnqykc = new zoijcleaow(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f37168eablkybsjg = 8;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo f37169gxszxtbevo = new C0836iobyxmoadg();

    /* JADX INFO: renamed from: gg1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0836iobyxmoadg extends androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo {
        C0836iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(lt0.ppxfxbqfkf oldItem, lt0.ppxfxbqfkf newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem.iobyxmoadg().iobyxmoadg(), newItem.iobyxmoadg().iobyxmoadg());
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public Object ppxfxbqfkf(lt0.ppxfxbqfkf oldItem, lt0.ppxfxbqfkf newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            ArrayList arrayList = new ArrayList();
            lt0.iobyxmoadg iobyxmoadgVarIobyxmoadg = oldItem.iobyxmoadg();
            lt0.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = newItem.iobyxmoadg();
            if (!zdlpuopuiu.eablkybsjg(oldItem.zoijcleaow(), newItem.zoijcleaow()) || iobyxmoadgVarIobyxmoadg.esjtqupxsv() != iobyxmoadgVarIobyxmoadg2.esjtqupxsv()) {
                arrayList.add(btonecajqb.f37153iobyxmoadg);
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(lt0.ppxfxbqfkf oldItem, lt0.ppxfxbqfkf newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem, newItem);
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(rgvfuqvkyq onProductClickedByArticle, rgvfuqvkyq onHintClicked, rgvfuqvkyq onReplaceClicked, tg.draadjrbmk onRemoveClicked) {
        super(f37169gxszxtbevo);
        zdlpuopuiu.btonecajqb(onProductClickedByArticle, "onProductClickedByArticle");
        zdlpuopuiu.btonecajqb(onHintClicked, "onHintClicked");
        zdlpuopuiu.btonecajqb(onReplaceClicked, "onReplaceClicked");
        zdlpuopuiu.btonecajqb(onRemoveClicked, "onRemoveClicked");
        RecyclerView.jyumaefscl jyumaefsclVar = new RecyclerView.jyumaefscl();
        this.f37171ppxfxbqfkf = jyumaefsclVar;
        this.f27903iobyxmoadg.ppxfxbqfkf(gxszxtbevo.eablkybsjg(onProductClickedByArticle, onHintClicked, onReplaceClicked, onRemoveClicked, jyumaefsclVar));
    }
}
