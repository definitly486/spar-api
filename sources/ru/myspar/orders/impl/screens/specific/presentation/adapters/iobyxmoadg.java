package ru.myspar.orders.impl.screens.specific.presentation.adapters;

import androidx.recyclerview.widget.nufgyqmvbu;
import df.wkgbmnqykc;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final zoijcleaow f91331ppxfxbqfkf = new zoijcleaow(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final nufgyqmvbu.gxszxtbevo f91332wkgbmnqykc = new C2118iobyxmoadg();

    /* JADX INFO: renamed from: ru.myspar.orders.impl.screens.specific.presentation.adapters.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2118iobyxmoadg extends nufgyqmvbu.gxszxtbevo {
        C2118iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(ru.zoijcleaow oldItem, ru.zoijcleaow newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem.getId(), newItem.getId());
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public List ppxfxbqfkf(ru.zoijcleaow oldItem, ru.zoijcleaow newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            ArrayList arrayList = new ArrayList();
            if (oldItem.dxjokdxxww() != newItem.dxjokdxxww()) {
                arrayList.add(new ReplaceAdapterPayload.SelectableChanged(newItem.dxjokdxxww()));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(ru.zoijcleaow oldItem, ru.zoijcleaow newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem, newItem);
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(rgvfuqvkyq onProductClickedByArticle, draadjrbmk onReplaceClicked) {
        super(f91332wkgbmnqykc);
        zdlpuopuiu.btonecajqb(onProductClickedByArticle, "onProductClickedByArticle");
        zdlpuopuiu.btonecajqb(onReplaceClicked, "onReplaceClicked");
        this.f27903iobyxmoadg.ppxfxbqfkf(ru.myspar.orders.impl.screens.specific.presentation.adapters.zoijcleaow.eablkybsjg(onProductClickedByArticle, onReplaceClicked));
    }
}
