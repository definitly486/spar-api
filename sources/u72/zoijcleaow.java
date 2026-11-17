package u72;

import android.content.Context;
import android.content.SharedPreferences;
import fk.dsvhmnatus;
import fk.stevsuqkhv;
import fk.wizcaqwiak;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import gk.eablkybsjg;
import gk.jyumaefscl;
import hg.ikoacuggdj;
import hg.tzroggbefp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k30.gtknphoqwx;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import ru.myspar.story.domain.model.StoryItem;
import ru.myspar.story.domain.model.StorySlide;
import sj.dxjokdxxww;
import sj.kegysxyocb;
import sj.nufgyqmvbu;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yj.iobyxmoadg f112959eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final gk.zoijcleaow f112960gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f112961iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zynmafqrjb f112962ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final yj.iobyxmoadg f112963wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final SharedPreferences f112964zoijcleaow;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f112965yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f112966zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            eablkybsjgVar.f112965yggfygwlhe = obj;
            return eablkybsjgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f112966zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) this.f112965yggfygwlhe;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f112966zdlpuopuiu = 1;
                if (nufgyqmvbuVar.emit(wwaezpbzknVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f112967cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f112969iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f112970jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f112971lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f112972yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112973zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112967cqumvgiudr = obj;
            this.f112971lereixgezr |= Integer.MIN_VALUE;
            return zoijcleaow.this.ojitshcjhn(null, null, this);
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f112975esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f112976iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f112977jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f112978yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112979zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112976iwizpuwonk = obj;
            this.f112975esjtqupxsv |= Integer.MIN_VALUE;
            return zoijcleaow.this.ppxfxbqfkf(null, this);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f112981esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f112982iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f112983jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f112984yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112985zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112982iwizpuwonk = obj;
            this.f112981esjtqupxsv |= Integer.MIN_VALUE;
            return zoijcleaow.this.rgvfuqvkyq(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f112986cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f112988jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f112989yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112990zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112988jyumaefscl = obj;
            this.f112986cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.dxjokdxxww(this);
        }
    }

    public static final class wkgbmnqykc implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f112991yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f112992zdlpuopuiu;

        public static final class iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f112993yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f112994zdlpuopuiu;

            /* JADX INFO: renamed from: u72.zoijcleaow$wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2798iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f112996yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f112997zdlpuopuiu;

                public C2798iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f112997zdlpuopuiu = obj;
                    this.f112996yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, zoijcleaow zoijcleaowVar) {
                this.f112994zdlpuopuiu = nufgyqmvbuVar;
                this.f112993yggfygwlhe = zoijcleaowVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2798iobyxmoadg c2798iobyxmoadg;
                if (gxszxtbevoVar instanceof C2798iobyxmoadg) {
                    c2798iobyxmoadg = (C2798iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2798iobyxmoadg.f112996yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2798iobyxmoadg.f112996yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2798iobyxmoadg = new C2798iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2798iobyxmoadg = new C2798iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2798iobyxmoadg.f112997zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2798iobyxmoadg.f112996yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f112994zdlpuopuiu;
                    Set setGxszxtbevo = this.f112993yggfygwlhe.gxszxtbevo();
                    c2798iobyxmoadg.f112996yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(setGxszxtbevo, c2798iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public wkgbmnqykc(sj.lqeggnwhkg lqeggnwhkgVar, zoijcleaow zoijcleaowVar) {
            this.f112992zdlpuopuiu = lqeggnwhkgVar;
            this.f112991yggfygwlhe = zoijcleaowVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f112992zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f112991yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: u72.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C2799zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f112999esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f113000iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f113001jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f113002yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f113003zdlpuopuiu;

        C2799zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f113000iwizpuwonk = obj;
            this.f112999esjtqupxsv |= Integer.MIN_VALUE;
            return zoijcleaow.this.lqeggnwhkg(null, this);
        }
    }

    public zoijcleaow(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f112961iobyxmoadg = context;
        this.f112964zoijcleaow = context.getSharedPreferences("stories_preferences", 0);
        this.f112962ppxfxbqfkf = kegysxyocb.iobyxmoadg(null);
        this.f112963wkgbmnqykc = yj.lqeggnwhkg.zoijcleaow(false, 1, null);
        this.f112959eablkybsjg = yj.lqeggnwhkg.zoijcleaow(false, 1, null);
        this.f112960gxszxtbevo = jyumaefscl.zoijcleaow(null, new tg.draadjrbmk() { // from class: u72.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zoijcleaow.btonecajqb((eablkybsjg) obj);
            }
        }, 1, null);
    }

    private final void agtfadlqog(Set set) {
        SharedPreferences preferences = this.f112964zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(preferences, "preferences");
        SharedPreferences.Editor editorEdit = preferences.edit();
        gk.zoijcleaow zoijcleaowVar = this.f112960gxszxtbevo;
        zoijcleaowVar.iobyxmoadg();
        editorEdit.putString("stories_viewed_slides", zoijcleaowVar.zoijcleaow(ck.iobyxmoadg.yggfygwlhe(new stevsuqkhv(wizcaqwiak.f34245iobyxmoadg)), set));
        editorEdit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(gk.eablkybsjg Json) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(Json, "$this$Json");
        Json.wkgbmnqykc(true);
        Json.eablkybsjg(true);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final Map eablkybsjg() {
        try {
            String string = this.f112964zoijcleaow.getString("stories_viewed_map", null);
            if (string == null) {
                return null;
            }
            gk.zoijcleaow zoijcleaowVar = this.f112960gxszxtbevo;
            zoijcleaowVar.iobyxmoadg();
            wizcaqwiak wizcaqwiakVar = wizcaqwiak.f34245iobyxmoadg;
            Map map = (Map) zoijcleaowVar.ppxfxbqfkf(ck.iobyxmoadg.yggfygwlhe(new dsvhmnatus(wizcaqwiakVar, wizcaqwiakVar)), string);
            if (map == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(tzroggbefp.eablkybsjg(map.size()));
            for (Object obj : map.entrySet()) {
                linkedHashMap.put(((Map.Entry) obj).getKey(), LocalDateTime.parse((CharSequence) ((Map.Entry) obj).getValue()));
            }
            return linkedHashMap;
        } catch (Exception unused) {
            wflxmlrfwp(null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set gxszxtbevo() {
        try {
            String string = this.f112964zoijcleaow.getString("stories_viewed_slides", null);
            if (string == null) {
                return null;
            }
            gk.zoijcleaow zoijcleaowVar = this.f112960gxszxtbevo;
            zoijcleaowVar.iobyxmoadg();
            return (Set) zoijcleaowVar.ppxfxbqfkf(new stevsuqkhv(wizcaqwiak.f34245iobyxmoadg), string);
        } catch (Exception unused) {
            wflxmlrfwp(null);
            return null;
        }
    }

    private final void wflxmlrfwp(Map map) {
        LinkedHashMap linkedHashMap;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(tzroggbefp.eablkybsjg(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((LocalDateTime) entry.getValue()).toString());
            }
        } else {
            linkedHashMap = null;
        }
        SharedPreferences preferences = this.f112964zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(preferences, "preferences");
        SharedPreferences.Editor editorEdit = preferences.edit();
        gk.zoijcleaow zoijcleaowVar = this.f112960gxszxtbevo;
        zoijcleaowVar.iobyxmoadg();
        wizcaqwiak wizcaqwiakVar = wizcaqwiak.f34245iobyxmoadg;
        editorEdit.putString("stories_viewed_map", zoijcleaowVar.zoijcleaow(ck.iobyxmoadg.yggfygwlhe(new dsvhmnatus(wizcaqwiakVar, wizcaqwiakVar)), linkedHashMap));
        editorEdit.apply();
    }

    public final sj.lqeggnwhkg draadjrbmk() {
        SharedPreferences preferences = this.f112964zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(preferences, "preferences");
        return new wkgbmnqykc(dxjokdxxww.tzroggbefp(gtknphoqwx.iobyxmoadg(preferences, "stories_viewed_slides"), new eablkybsjg(null)), this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        zoijcleaow zoijcleaowVar;
        yj.iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f112986cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f112986cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f112988jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f112986cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            yj.iobyxmoadg iobyxmoadgVar2 = this.f112963wkgbmnqykc;
            ppxfxbqfkfVar.f112990zdlpuopuiu = this;
            ppxfxbqfkfVar.f112989yggfygwlhe = iobyxmoadgVar2;
            ppxfxbqfkfVar.f112986cqumvgiudr = 1;
            if (iobyxmoadgVar2.iobyxmoadg(null, ppxfxbqfkfVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
            iobyxmoadgVar = iobyxmoadgVar2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (yj.iobyxmoadg) ppxfxbqfkfVar.f112989yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) ppxfxbqfkfVar.f112990zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
        }
        try {
            return zoijcleaowVar.gxszxtbevo();
        } finally {
            iobyxmoadgVar.eablkybsjg(null);
        }
    }

    public final sj.lqeggnwhkg gtknphoqwx() {
        return dxjokdxxww.iobyxmoadg(this.f112962ppxfxbqfkf);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object lqeggnwhkg(String str, lg.gxszxtbevo gxszxtbevoVar) {
        C2799zoijcleaow c2799zoijcleaow;
        yj.iobyxmoadg iobyxmoadgVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof C2799zoijcleaow) {
            c2799zoijcleaow = (C2799zoijcleaow) gxszxtbevoVar;
            int i13 = c2799zoijcleaow.f112999esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2799zoijcleaow.f112999esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                c2799zoijcleaow = new C2799zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c2799zoijcleaow = new C2799zoijcleaow(gxszxtbevoVar);
        }
        Object obj = c2799zoijcleaow.f113000iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2799zoijcleaow.f112999esjtqupxsv;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar = this.f112959eablkybsjg;
            c2799zoijcleaow.f113003zdlpuopuiu = this;
            c2799zoijcleaow.f113002yggfygwlhe = str;
            c2799zoijcleaow.f113001jyumaefscl = iobyxmoadgVar;
            c2799zoijcleaow.f112999esjtqupxsv = 1;
            if (iobyxmoadgVar.iobyxmoadg(null, c2799zoijcleaow) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yj.iobyxmoadg iobyxmoadgVar2 = (yj.iobyxmoadg) c2799zoijcleaow.f113001jyumaefscl;
            String str2 = (String) c2799zoijcleaow.f113002yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) c2799zoijcleaow.f113003zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar = iobyxmoadgVar2;
            str = str2;
        }
        try {
            Map mapEablkybsjg = zoijcleaowVar.eablkybsjg();
            return mapEablkybsjg != null ? (LocalDateTime) mapEablkybsjg.get(str) : null;
        } finally {
            iobyxmoadgVar.eablkybsjg(null);
        }
    }

    public final List nufgyqmvbu() {
        return (List) this.f112962ppxfxbqfkf.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ojitshcjhn(String str, LocalDateTime localDateTime, lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        yj.iobyxmoadg iobyxmoadgVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f112971lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f112971lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object obj = gxszxtbevoVar2.f112967cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f112971lereixgezr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar = this.f112959eablkybsjg;
            gxszxtbevoVar2.f112973zdlpuopuiu = this;
            gxszxtbevoVar2.f112972yggfygwlhe = str;
            gxszxtbevoVar2.f112970jyumaefscl = localDateTime;
            gxszxtbevoVar2.f112969iwizpuwonk = iobyxmoadgVar;
            gxszxtbevoVar2.f112971lereixgezr = 1;
            if (iobyxmoadgVar.iobyxmoadg(null, gxszxtbevoVar2) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yj.iobyxmoadg iobyxmoadgVar2 = (yj.iobyxmoadg) gxszxtbevoVar2.f112969iwizpuwonk;
            localDateTime = (LocalDateTime) gxszxtbevoVar2.f112970jyumaefscl;
            String str2 = (String) gxszxtbevoVar2.f112972yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar2.f112973zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar = iobyxmoadgVar2;
            str = str2;
        }
        try {
            Map mapEablkybsjg = zoijcleaowVar.eablkybsjg();
            if (mapEablkybsjg == null) {
                mapEablkybsjg = tzroggbefp.dxjokdxxww();
            }
            Map mapIwizpuwonk = tzroggbefp.iwizpuwonk(mapEablkybsjg);
            mapIwizpuwonk.put(str, localDateTime);
            zoijcleaowVar.wflxmlrfwp(mapIwizpuwonk);
            return wwaezpbzkn.f37140iobyxmoadg;
        } finally {
            iobyxmoadgVar.eablkybsjg(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ppxfxbqfkf(String str, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        yj.iobyxmoadg iobyxmoadgVar2;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f112975esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f112975esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f112976iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f112975esjtqupxsv;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar2 = this.f112963wkgbmnqykc;
            iobyxmoadgVar.f112979zdlpuopuiu = this;
            iobyxmoadgVar.f112978yggfygwlhe = str;
            iobyxmoadgVar.f112977jyumaefscl = iobyxmoadgVar2;
            iobyxmoadgVar.f112975esjtqupxsv = 1;
            if (iobyxmoadgVar2.iobyxmoadg(null, iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yj.iobyxmoadg iobyxmoadgVar3 = (yj.iobyxmoadg) iobyxmoadgVar.f112977jyumaefscl;
            String str2 = (String) iobyxmoadgVar.f112978yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f112979zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar2 = iobyxmoadgVar3;
            str = str2;
        }
        try {
            Set setGxszxtbevo = zoijcleaowVar.gxszxtbevo();
            if (setGxszxtbevo == null) {
                setGxszxtbevo = ikoacuggdj.eablkybsjg();
            }
            Set setQ = hg.jyumaefscl.q(setGxszxtbevo);
            setQ.add(str);
            zoijcleaowVar.agtfadlqog(setQ);
            return wwaezpbzkn.f37140iobyxmoadg;
        } finally {
            iobyxmoadgVar2.eablkybsjg(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object rgvfuqvkyq(List list, lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        yj.iobyxmoadg iobyxmoadgVar;
        zoijcleaow zoijcleaowVar;
        Object value;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i13 = lqeggnwhkgVar.f112981esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f112981esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object obj = lqeggnwhkgVar.f112982iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lqeggnwhkgVar.f112981esjtqupxsv;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar = this.f112963wkgbmnqykc;
            lqeggnwhkgVar.f112985zdlpuopuiu = this;
            lqeggnwhkgVar.f112984yggfygwlhe = list;
            lqeggnwhkgVar.f112983jyumaefscl = iobyxmoadgVar;
            lqeggnwhkgVar.f112981esjtqupxsv = 1;
            if (iobyxmoadgVar.iobyxmoadg(null, lqeggnwhkgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yj.iobyxmoadg iobyxmoadgVar2 = (yj.iobyxmoadg) lqeggnwhkgVar.f112983jyumaefscl;
            List list2 = (List) lqeggnwhkgVar.f112984yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) lqeggnwhkgVar.f112985zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar = iobyxmoadgVar2;
            list = list2;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List slides = ((StoryItem) it.next()).getSlides();
                ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(slides, 10));
                Iterator it2 = slides.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((StorySlide) it2.next()).getId());
                }
                hg.jyumaefscl.istkbnxepw(arrayList, arrayList2);
            }
            Set setR = hg.jyumaefscl.r(arrayList);
            Set setGxszxtbevo = zoijcleaowVar.gxszxtbevo();
            if (setGxszxtbevo == null) {
                setGxszxtbevo = ikoacuggdj.eablkybsjg();
            }
            zoijcleaowVar.agtfadlqog(hg.jyumaefscl.tbqsvytpvh(setR, setGxszxtbevo));
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            iobyxmoadgVar.eablkybsjg(null);
            zynmafqrjb zynmafqrjbVar = zoijcleaowVar.f112962ppxfxbqfkf;
            do {
                value = zynmafqrjbVar.getValue();
            } while (!zynmafqrjbVar.compareAndSet(value, list));
            return wwaezpbzkn.f37140iobyxmoadg;
        } catch (Throwable th2) {
            iobyxmoadgVar.eablkybsjg(null);
            throw th2;
        }
    }

    public final void wkgbmnqykc() {
        Object value;
        zynmafqrjb zynmafqrjbVar = this.f112962ppxfxbqfkf;
        do {
            value = zynmafqrjbVar.getValue();
        } while (!zynmafqrjbVar.compareAndSet(value, null));
    }
}
