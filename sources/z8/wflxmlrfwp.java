package z8;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final Map f129301iobyxmoadg = new HashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ojitshcjhn.zoijcleaow f129302zoijcleaow;

    class iobyxmoadg implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx f129304zdlpuopuiu;

        iobyxmoadg(androidx.lifecycle.gtknphoqwx gtknphoqwxVar) {
            this.f129304zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // z8.draadjrbmk
        public void onDestroy() {
            wflxmlrfwp.this.f129301iobyxmoadg.remove(this.f129304zdlpuopuiu);
        }

        @Override // z8.draadjrbmk
        public void onStart() {
        }

        @Override // z8.draadjrbmk
        public void onStop() {
        }
    }

    private final class zoijcleaow implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final FragmentManager f129305iobyxmoadg;

        zoijcleaow(FragmentManager fragmentManager) {
            this.f129305iobyxmoadg = fragmentManager;
        }

        private void zoijcleaow(FragmentManager fragmentManager, Set set) {
            List listIgdgnonuha = fragmentManager.igdgnonuha();
            int size = listIgdgnonuha.size();
            for (int i13 = 0; i13 < size; i13++) {
                Fragment fragment = (Fragment) listIgdgnonuha.get(i13);
                zoijcleaow(fragment.getChildFragmentManager(), set);
                com.bumptech.glide.agtfadlqog agtfadlqogVarIobyxmoadg = wflxmlrfwp.this.iobyxmoadg(fragment.getLifecycle());
                if (agtfadlqogVarIobyxmoadg != null) {
                    set.add(agtfadlqogVarIobyxmoadg);
                }
            }
        }

        @Override // z8.rgvfuqvkyq
        public Set iobyxmoadg() {
            HashSet hashSet = new HashSet();
            zoijcleaow(this.f129305iobyxmoadg, hashSet);
            return hashSet;
        }
    }

    wflxmlrfwp(ojitshcjhn.zoijcleaow zoijcleaowVar) {
        this.f129302zoijcleaow = zoijcleaowVar;
    }

    com.bumptech.glide.agtfadlqog iobyxmoadg(androidx.lifecycle.gtknphoqwx gtknphoqwxVar) {
        g9.draadjrbmk.iobyxmoadg();
        return (com.bumptech.glide.agtfadlqog) this.f129301iobyxmoadg.get(gtknphoqwxVar);
    }

    com.bumptech.glide.agtfadlqog zoijcleaow(Context context, com.bumptech.glide.zoijcleaow zoijcleaowVar, androidx.lifecycle.gtknphoqwx gtknphoqwxVar, FragmentManager fragmentManager, boolean z13) {
        g9.draadjrbmk.iobyxmoadg();
        com.bumptech.glide.agtfadlqog agtfadlqogVarIobyxmoadg = iobyxmoadg(gtknphoqwxVar);
        if (agtfadlqogVarIobyxmoadg != null) {
            return agtfadlqogVarIobyxmoadg;
        }
        gtknphoqwx gtknphoqwxVar2 = new gtknphoqwx(gtknphoqwxVar);
        com.bumptech.glide.agtfadlqog agtfadlqogVarIobyxmoadg2 = this.f129302zoijcleaow.iobyxmoadg(zoijcleaowVar, gtknphoqwxVar2, new zoijcleaow(fragmentManager), context);
        this.f129301iobyxmoadg.put(gtknphoqwxVar, agtfadlqogVarIobyxmoadg2);
        gtknphoqwxVar2.iobyxmoadg(new iobyxmoadg(gtknphoqwxVar));
        if (z13) {
            agtfadlqogVarIobyxmoadg2.onStart();
        }
        return agtfadlqogVarIobyxmoadg2;
    }
}
