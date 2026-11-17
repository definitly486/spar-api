package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg extends esjtqupxsv {

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private static TimeInterpolator f13031kcexrzcfyt;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private ArrayList f13037nufgyqmvbu = new ArrayList();

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private ArrayList f13035dxjokdxxww = new ArrayList();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private ArrayList f13033btonecajqb = new ArrayList();

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private ArrayList f13036gtknphoqwx = new ArrayList();

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    ArrayList f13034draadjrbmk = new ArrayList();

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    ArrayList f13042wflxmlrfwp = new ArrayList();

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    ArrayList f13032agtfadlqog = new ArrayList();

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    ArrayList f13038ojitshcjhn = new ArrayList();

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    ArrayList f13040rgvfuqvkyq = new ArrayList();

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    ArrayList f13041vdvldrhtss = new ArrayList();

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    ArrayList f13039oxmwwwfdhm = new ArrayList();

    private static class btonecajqb {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public int f13043eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public RecyclerView.iozdgvuglv f13044iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public int f13045ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public int f13046wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public int f13047zoijcleaow;

        btonecajqb(RecyclerView.iozdgvuglv iozdgvuglvVar, int i13, int i14, int i15, int i16) {
            this.f13044iobyxmoadg = iozdgvuglvVar;
            this.f13047zoijcleaow = i13;
            this.f13045ppxfxbqfkf = i14;
            this.f13046wkgbmnqykc = i15;
            this.f13043eablkybsjg = i16;
        }
    }

    class eablkybsjg extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ RecyclerView.iozdgvuglv f13054iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13055ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ View f13057zoijcleaow;

        eablkybsjg(RecyclerView.iozdgvuglv iozdgvuglvVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f13054iobyxmoadg = iozdgvuglvVar;
            this.f13057zoijcleaow = view;
            this.f13055ppxfxbqfkf = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13057zoijcleaow.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13055ppxfxbqfkf.setListener(null);
            lqeggnwhkg.this.istkbnxepw(this.f13054iobyxmoadg);
            lqeggnwhkg.this.f13038ojitshcjhn.remove(this.f13054iobyxmoadg);
            lqeggnwhkg.this.jlmebxxoox();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            lqeggnwhkg.this.cdpycssgdh(this.f13054iobyxmoadg);
        }
    }

    class gxszxtbevo extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13058eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ RecyclerView.iozdgvuglv f13060iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ View f13061ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ int f13062wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ int f13063zoijcleaow;

        gxszxtbevo(RecyclerView.iozdgvuglv iozdgvuglvVar, int i13, View view, int i14, ViewPropertyAnimator viewPropertyAnimator) {
            this.f13060iobyxmoadg = iozdgvuglvVar;
            this.f13063zoijcleaow = i13;
            this.f13061ppxfxbqfkf = view;
            this.f13062wkgbmnqykc = i14;
            this.f13058eablkybsjg = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f13063zoijcleaow != 0) {
                this.f13061ppxfxbqfkf.setTranslationX(0.0f);
            }
            if (this.f13062wkgbmnqykc != 0) {
                this.f13061ppxfxbqfkf.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13058eablkybsjg.setListener(null);
            lqeggnwhkg.this.lmojexxdyd(this.f13060iobyxmoadg);
            lqeggnwhkg.this.f13040rgvfuqvkyq.remove(this.f13060iobyxmoadg);
            lqeggnwhkg.this.jlmebxxoox();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            lqeggnwhkg.this.wwaezpbzkn(this.f13060iobyxmoadg);
        }
    }

    class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ArrayList f13065zdlpuopuiu;

        iobyxmoadg(ArrayList arrayList) {
            this.f13065zdlpuopuiu = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (btonecajqb btonecajqbVar : this.f13065zdlpuopuiu) {
                lqeggnwhkg.this.ulzqkzuiru(btonecajqbVar.f13044iobyxmoadg, btonecajqbVar.f13047zoijcleaow, btonecajqbVar.f13045ppxfxbqfkf, btonecajqbVar.f13046wkgbmnqykc, btonecajqbVar.f13043eablkybsjg);
            }
            this.f13065zdlpuopuiu.clear();
            lqeggnwhkg.this.f13042wflxmlrfwp.remove(this.f13065zdlpuopuiu);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.lqeggnwhkg$lqeggnwhkg, reason: collision with other inner class name */
    class C0182lqeggnwhkg extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ dxjokdxxww f13066iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ View f13067ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13069zoijcleaow;

        C0182lqeggnwhkg(dxjokdxxww dxjokdxxwwVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f13066iobyxmoadg = dxjokdxxwwVar;
            this.f13069zoijcleaow = viewPropertyAnimator;
            this.f13067ppxfxbqfkf = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13069zoijcleaow.setListener(null);
            this.f13067ppxfxbqfkf.setAlpha(1.0f);
            this.f13067ppxfxbqfkf.setTranslationX(0.0f);
            this.f13067ppxfxbqfkf.setTranslationY(0.0f);
            lqeggnwhkg.this.yadqdtsiqt(this.f13066iobyxmoadg.f13050iobyxmoadg, true);
            lqeggnwhkg.this.f13039oxmwwwfdhm.remove(this.f13066iobyxmoadg.f13050iobyxmoadg);
            lqeggnwhkg.this.jlmebxxoox();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            lqeggnwhkg.this.iozdgvuglv(this.f13066iobyxmoadg.f13050iobyxmoadg, true);
        }
    }

    class nufgyqmvbu extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ dxjokdxxww f13070iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ View f13071ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13073zoijcleaow;

        nufgyqmvbu(dxjokdxxww dxjokdxxwwVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f13070iobyxmoadg = dxjokdxxwwVar;
            this.f13073zoijcleaow = viewPropertyAnimator;
            this.f13071ppxfxbqfkf = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13073zoijcleaow.setListener(null);
            this.f13071ppxfxbqfkf.setAlpha(1.0f);
            this.f13071ppxfxbqfkf.setTranslationX(0.0f);
            this.f13071ppxfxbqfkf.setTranslationY(0.0f);
            lqeggnwhkg.this.yadqdtsiqt(this.f13070iobyxmoadg.f13053zoijcleaow, false);
            lqeggnwhkg.this.f13039oxmwwwfdhm.remove(this.f13070iobyxmoadg.f13053zoijcleaow);
            lqeggnwhkg.this.jlmebxxoox();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            lqeggnwhkg.this.iozdgvuglv(this.f13070iobyxmoadg.f13053zoijcleaow, false);
        }
    }

    class ppxfxbqfkf implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ArrayList f13075zdlpuopuiu;

        ppxfxbqfkf(ArrayList arrayList) {
            this.f13075zdlpuopuiu = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f13075zdlpuopuiu.iterator();
            while (it.hasNext()) {
                lqeggnwhkg.this.mbcevpiqjq((RecyclerView.iozdgvuglv) it.next());
            }
            this.f13075zdlpuopuiu.clear();
            lqeggnwhkg.this.f13034draadjrbmk.remove(this.f13075zdlpuopuiu);
        }
    }

    class wkgbmnqykc extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ RecyclerView.iozdgvuglv f13076iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ View f13077ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13079zoijcleaow;

        wkgbmnqykc(RecyclerView.iozdgvuglv iozdgvuglvVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f13076iobyxmoadg = iozdgvuglvVar;
            this.f13079zoijcleaow = viewPropertyAnimator;
            this.f13077ppxfxbqfkf = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13079zoijcleaow.setListener(null);
            this.f13077ppxfxbqfkf.setAlpha(1.0f);
            lqeggnwhkg.this.ylkuphrtab(this.f13076iobyxmoadg);
            lqeggnwhkg.this.f13041vdvldrhtss.remove(this.f13076iobyxmoadg);
            lqeggnwhkg.this.jlmebxxoox();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            lqeggnwhkg.this.pkzmftpjix(this.f13076iobyxmoadg);
        }
    }

    class zoijcleaow implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ArrayList f13081zdlpuopuiu;

        zoijcleaow(ArrayList arrayList) {
            this.f13081zdlpuopuiu = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f13081zdlpuopuiu.iterator();
            while (it.hasNext()) {
                lqeggnwhkg.this.ntlheqmsrt((dxjokdxxww) it.next());
            }
            this.f13081zdlpuopuiu.clear();
            lqeggnwhkg.this.f13032agtfadlqog.remove(this.f13081zdlpuopuiu);
        }
    }

    private void ikoacuggdj(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        if (f13031kcexrzcfyt == null) {
            f13031kcexrzcfyt = new ValueAnimator().getInterpolator();
        }
        iozdgvuglvVar.itemView.animate().setInterpolator(f13031kcexrzcfyt);
        btonecajqb(iozdgvuglvVar);
    }

    private boolean jhduphickx(dxjokdxxww dxjokdxxwwVar, RecyclerView.iozdgvuglv iozdgvuglvVar) {
        boolean z13 = false;
        if (dxjokdxxwwVar.f13053zoijcleaow == iozdgvuglvVar) {
            dxjokdxxwwVar.f13053zoijcleaow = null;
        } else {
            if (dxjokdxxwwVar.f13050iobyxmoadg != iozdgvuglvVar) {
                return false;
            }
            dxjokdxxwwVar.f13050iobyxmoadg = null;
            z13 = true;
        }
        iozdgvuglvVar.itemView.setAlpha(1.0f);
        iozdgvuglvVar.itemView.setTranslationX(0.0f);
        iozdgvuglvVar.itemView.setTranslationY(0.0f);
        yadqdtsiqt(iozdgvuglvVar, z13);
        return true;
    }

    private void ribwqtqdhb(List list, RecyclerView.iozdgvuglv iozdgvuglvVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) list.get(size);
            if (jhduphickx(dxjokdxxwwVar, iozdgvuglvVar) && dxjokdxxwwVar.f13050iobyxmoadg == null && dxjokdxxwwVar.f13053zoijcleaow == null) {
                list.remove(dxjokdxxwwVar);
            }
        }
    }

    private void sopmlzcsov(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        View view = iozdgvuglvVar.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f13041vdvldrhtss.add(iozdgvuglvVar);
        viewPropertyAnimatorAnimate.setDuration(ojitshcjhn()).alpha(0.0f).setListener(new wkgbmnqykc(iozdgvuglvVar, viewPropertyAnimatorAnimate, view)).start();
    }

    private void vipkmwdibw(dxjokdxxww dxjokdxxwwVar) {
        RecyclerView.iozdgvuglv iozdgvuglvVar = dxjokdxxwwVar.f13050iobyxmoadg;
        if (iozdgvuglvVar != null) {
            jhduphickx(dxjokdxxwwVar, iozdgvuglvVar);
        }
        RecyclerView.iozdgvuglv iozdgvuglvVar2 = dxjokdxxwwVar.f13053zoijcleaow;
        if (iozdgvuglvVar2 != null) {
            jhduphickx(dxjokdxxwwVar, iozdgvuglvVar2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.wflxmlrfwp
    public void btonecajqb(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        View view = iozdgvuglvVar.itemView;
        view.animate().cancel();
        int size = this.f13033btonecajqb.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((btonecajqb) this.f13033btonecajqb.get(size)).f13044iobyxmoadg == iozdgvuglvVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                lmojexxdyd(iozdgvuglvVar);
                this.f13033btonecajqb.remove(size);
            }
        }
        ribwqtqdhb(this.f13036gtknphoqwx, iozdgvuglvVar);
        if (this.f13037nufgyqmvbu.remove(iozdgvuglvVar)) {
            view.setAlpha(1.0f);
            ylkuphrtab(iozdgvuglvVar);
        }
        if (this.f13035dxjokdxxww.remove(iozdgvuglvVar)) {
            view.setAlpha(1.0f);
            istkbnxepw(iozdgvuglvVar);
        }
        for (int size2 = this.f13032agtfadlqog.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f13032agtfadlqog.get(size2);
            ribwqtqdhb(arrayList, iozdgvuglvVar);
            if (arrayList.isEmpty()) {
                this.f13032agtfadlqog.remove(size2);
            }
        }
        for (int size3 = this.f13042wflxmlrfwp.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f13042wflxmlrfwp.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (((btonecajqb) arrayList2.get(size4)).f13044iobyxmoadg == iozdgvuglvVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    lmojexxdyd(iozdgvuglvVar);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f13042wflxmlrfwp.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f13034draadjrbmk.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f13034draadjrbmk.get(size5);
            if (arrayList3.remove(iozdgvuglvVar)) {
                view.setAlpha(1.0f);
                istkbnxepw(iozdgvuglvVar);
                if (arrayList3.isEmpty()) {
                    this.f13034draadjrbmk.remove(size5);
                }
            }
        }
        this.f13041vdvldrhtss.remove(iozdgvuglvVar);
        this.f13038ojitshcjhn.remove(iozdgvuglvVar);
        this.f13039oxmwwwfdhm.remove(iozdgvuglvVar);
        this.f13040rgvfuqvkyq.remove(iozdgvuglvVar);
        jlmebxxoox();
    }

    void crxdokpmqz(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.iozdgvuglv) list.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.esjtqupxsv
    public boolean esjtqupxsv(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        ikoacuggdj(iozdgvuglvVar);
        iozdgvuglvVar.itemView.setAlpha(0.0f);
        this.f13035dxjokdxxww.add(iozdgvuglvVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.wflxmlrfwp
    public void gtknphoqwx() {
        int size = this.f13033btonecajqb.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            btonecajqb btonecajqbVar = (btonecajqb) this.f13033btonecajqb.get(size);
            View view = btonecajqbVar.f13044iobyxmoadg.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            lmojexxdyd(btonecajqbVar.f13044iobyxmoadg);
            this.f13033btonecajqb.remove(size);
        }
        for (int size2 = this.f13037nufgyqmvbu.size() - 1; size2 >= 0; size2--) {
            ylkuphrtab((RecyclerView.iozdgvuglv) this.f13037nufgyqmvbu.get(size2));
            this.f13037nufgyqmvbu.remove(size2);
        }
        int size3 = this.f13035dxjokdxxww.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.iozdgvuglv iozdgvuglvVar = (RecyclerView.iozdgvuglv) this.f13035dxjokdxxww.get(size3);
            iozdgvuglvVar.itemView.setAlpha(1.0f);
            istkbnxepw(iozdgvuglvVar);
            this.f13035dxjokdxxww.remove(size3);
        }
        for (int size4 = this.f13036gtknphoqwx.size() - 1; size4 >= 0; size4--) {
            vipkmwdibw((dxjokdxxww) this.f13036gtknphoqwx.get(size4));
        }
        this.f13036gtknphoqwx.clear();
        if (rgvfuqvkyq()) {
            for (int size5 = this.f13042wflxmlrfwp.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f13042wflxmlrfwp.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    btonecajqb btonecajqbVar2 = (btonecajqb) arrayList.get(size6);
                    View view2 = btonecajqbVar2.f13044iobyxmoadg.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    lmojexxdyd(btonecajqbVar2.f13044iobyxmoadg);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f13042wflxmlrfwp.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f13034draadjrbmk.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f13034draadjrbmk.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.iozdgvuglv iozdgvuglvVar2 = (RecyclerView.iozdgvuglv) arrayList2.get(size8);
                    iozdgvuglvVar2.itemView.setAlpha(1.0f);
                    istkbnxepw(iozdgvuglvVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f13034draadjrbmk.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f13032agtfadlqog.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f13032agtfadlqog.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    vipkmwdibw((dxjokdxxww) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f13032agtfadlqog.remove(arrayList3);
                    }
                }
            }
            crxdokpmqz(this.f13041vdvldrhtss);
            crxdokpmqz(this.f13040rgvfuqvkyq);
            crxdokpmqz(this.f13038ojitshcjhn);
            crxdokpmqz(this.f13039oxmwwwfdhm);
            dxjokdxxww();
        }
    }

    void jlmebxxoox() {
        if (rgvfuqvkyq()) {
            return;
        }
        dxjokdxxww();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.wflxmlrfwp
    public void jyumaefscl() {
        boolean zIsEmpty = this.f13037nufgyqmvbu.isEmpty();
        boolean zIsEmpty2 = this.f13033btonecajqb.isEmpty();
        boolean zIsEmpty3 = this.f13036gtknphoqwx.isEmpty();
        boolean zIsEmpty4 = this.f13035dxjokdxxww.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator it = this.f13037nufgyqmvbu.iterator();
        while (it.hasNext()) {
            sopmlzcsov((RecyclerView.iozdgvuglv) it.next());
        }
        this.f13037nufgyqmvbu.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f13033btonecajqb);
            this.f13042wflxmlrfwp.add(arrayList);
            this.f13033btonecajqb.clear();
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(arrayList);
            if (zIsEmpty) {
                iobyxmoadgVar.run();
            } else {
                jhduphickx.rlfsiqarku(((btonecajqb) arrayList.get(0)).f13044iobyxmoadg.itemView, iobyxmoadgVar, ojitshcjhn());
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f13036gtknphoqwx);
            this.f13032agtfadlqog.add(arrayList2);
            this.f13036gtknphoqwx.clear();
            zoijcleaow zoijcleaowVar = new zoijcleaow(arrayList2);
            if (zIsEmpty) {
                zoijcleaowVar.run();
            } else {
                jhduphickx.rlfsiqarku(((dxjokdxxww) arrayList2.get(0)).f13050iobyxmoadg.itemView, zoijcleaowVar, ojitshcjhn());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.f13035dxjokdxxww);
        this.f13034draadjrbmk.add(arrayList3);
        this.f13035dxjokdxxww.clear();
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            ppxfxbqfkfVar.run();
        } else {
            jhduphickx.rlfsiqarku(((RecyclerView.iozdgvuglv) arrayList3.get(0)).itemView, ppxfxbqfkfVar, (!zIsEmpty ? ojitshcjhn() : 0L) + Math.max(!zIsEmpty2 ? agtfadlqog() : 0L, zIsEmpty3 ? 0L : wflxmlrfwp()));
        }
    }

    @Override // androidx.recyclerview.widget.esjtqupxsv
    public boolean lereixgezr(RecyclerView.iozdgvuglv iozdgvuglvVar, RecyclerView.iozdgvuglv iozdgvuglvVar2, int i13, int i14, int i15, int i16) {
        if (iozdgvuglvVar == iozdgvuglvVar2) {
            return pmvmpeiblj(iozdgvuglvVar, i13, i14, i15, i16);
        }
        float translationX = iozdgvuglvVar.itemView.getTranslationX();
        float translationY = iozdgvuglvVar.itemView.getTranslationY();
        float alpha = iozdgvuglvVar.itemView.getAlpha();
        ikoacuggdj(iozdgvuglvVar);
        int i17 = (int) ((i15 - i13) - translationX);
        int i18 = (int) ((i16 - i14) - translationY);
        iozdgvuglvVar.itemView.setTranslationX(translationX);
        iozdgvuglvVar.itemView.setTranslationY(translationY);
        iozdgvuglvVar.itemView.setAlpha(alpha);
        if (iozdgvuglvVar2 != null) {
            ikoacuggdj(iozdgvuglvVar2);
            iozdgvuglvVar2.itemView.setTranslationX(-i17);
            iozdgvuglvVar2.itemView.setTranslationY(-i18);
            iozdgvuglvVar2.itemView.setAlpha(0.0f);
        }
        this.f13036gtknphoqwx.add(new dxjokdxxww(iozdgvuglvVar, iozdgvuglvVar2, i13, i14, i15, i16));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.wflxmlrfwp
    public boolean lqeggnwhkg(RecyclerView.iozdgvuglv iozdgvuglvVar, List list) {
        return !list.isEmpty() || super.lqeggnwhkg(iozdgvuglvVar, list);
    }

    void mbcevpiqjq(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        View view = iozdgvuglvVar.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f13038ojitshcjhn.add(iozdgvuglvVar);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(draadjrbmk()).setListener(new eablkybsjg(iozdgvuglvVar, view, viewPropertyAnimatorAnimate)).start();
    }

    void ntlheqmsrt(dxjokdxxww dxjokdxxwwVar) {
        RecyclerView.iozdgvuglv iozdgvuglvVar = dxjokdxxwwVar.f13050iobyxmoadg;
        View view = iozdgvuglvVar == null ? null : iozdgvuglvVar.itemView;
        RecyclerView.iozdgvuglv iozdgvuglvVar2 = dxjokdxxwwVar.f13053zoijcleaow;
        View view2 = iozdgvuglvVar2 != null ? iozdgvuglvVar2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(wflxmlrfwp());
            this.f13039oxmwwwfdhm.add(dxjokdxxwwVar.f13050iobyxmoadg);
            duration.translationX(dxjokdxxwwVar.f13048eablkybsjg - dxjokdxxwwVar.f13051ppxfxbqfkf);
            duration.translationY(dxjokdxxwwVar.f13049gxszxtbevo - dxjokdxxwwVar.f13052wkgbmnqykc);
            duration.alpha(0.0f).setListener(new C0182lqeggnwhkg(dxjokdxxwwVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f13039oxmwwwfdhm.add(dxjokdxxwwVar.f13053zoijcleaow);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(wflxmlrfwp()).alpha(1.0f).setListener(new nufgyqmvbu(dxjokdxxwwVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.esjtqupxsv
    public boolean pmvmpeiblj(RecyclerView.iozdgvuglv iozdgvuglvVar, int i13, int i14, int i15, int i16) {
        View view = iozdgvuglvVar.itemView;
        int translationX = i13 + ((int) view.getTranslationX());
        int translationY = i14 + ((int) iozdgvuglvVar.itemView.getTranslationY());
        ikoacuggdj(iozdgvuglvVar);
        int i17 = i15 - translationX;
        int i18 = i16 - translationY;
        if (i17 == 0 && i18 == 0) {
            lmojexxdyd(iozdgvuglvVar);
            return false;
        }
        if (i17 != 0) {
            view.setTranslationX(-i17);
        }
        if (i18 != 0) {
            view.setTranslationY(-i18);
        }
        this.f13033btonecajqb.add(new btonecajqb(iozdgvuglvVar, translationX, translationY, i15, i16));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.wflxmlrfwp
    public boolean rgvfuqvkyq() {
        return (this.f13035dxjokdxxww.isEmpty() && this.f13036gtknphoqwx.isEmpty() && this.f13033btonecajqb.isEmpty() && this.f13037nufgyqmvbu.isEmpty() && this.f13040rgvfuqvkyq.isEmpty() && this.f13041vdvldrhtss.isEmpty() && this.f13038ojitshcjhn.isEmpty() && this.f13039oxmwwwfdhm.isEmpty() && this.f13042wflxmlrfwp.isEmpty() && this.f13034draadjrbmk.isEmpty() && this.f13032agtfadlqog.isEmpty()) ? false : true;
    }

    void ulzqkzuiru(RecyclerView.iozdgvuglv iozdgvuglvVar, int i13, int i14, int i15, int i16) {
        View view = iozdgvuglvVar.itemView;
        int i17 = i15 - i13;
        int i18 = i16 - i14;
        if (i17 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i18 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f13040rgvfuqvkyq.add(iozdgvuglvVar);
        viewPropertyAnimatorAnimate.setDuration(agtfadlqog()).setListener(new gxszxtbevo(iozdgvuglvVar, i17, view, i18, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.esjtqupxsv
    public boolean zynmafqrjb(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        ikoacuggdj(iozdgvuglvVar);
        this.f13037nufgyqmvbu.add(iozdgvuglvVar);
        return true;
    }

    private static class dxjokdxxww {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public int f13048eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public int f13049gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public RecyclerView.iozdgvuglv f13050iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public int f13051ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public int f13052wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public RecyclerView.iozdgvuglv f13053zoijcleaow;

        private dxjokdxxww(RecyclerView.iozdgvuglv iozdgvuglvVar, RecyclerView.iozdgvuglv iozdgvuglvVar2) {
            this.f13050iobyxmoadg = iozdgvuglvVar;
            this.f13053zoijcleaow = iozdgvuglvVar2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f13050iobyxmoadg + ", newHolder=" + this.f13053zoijcleaow + ", fromX=" + this.f13051ppxfxbqfkf + ", fromY=" + this.f13052wkgbmnqykc + ", toX=" + this.f13048eablkybsjg + ", toY=" + this.f13049gxszxtbevo + '}';
        }

        dxjokdxxww(RecyclerView.iozdgvuglv iozdgvuglvVar, RecyclerView.iozdgvuglv iozdgvuglvVar2, int i13, int i14, int i15, int i16) {
            this(iozdgvuglvVar, iozdgvuglvVar2);
            this.f13051ppxfxbqfkf = i13;
            this.f13052wkgbmnqykc = i14;
            this.f13048eablkybsjg = i15;
            this.f13049gxszxtbevo = i16;
        }
    }
}
