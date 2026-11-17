package nt1;

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
import kotlin.coroutines.jvm.internal.draadjrbmk;
import ru.myspar.proloyalty.story.domain.model.StoryItem;
import ru.myspar.proloyalty.story.domain.model.StorySlide;
import sj.dxjokdxxww;
import sj.kegysxyocb;
import sj.nufgyqmvbu;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yj.iobyxmoadg f71007eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final yj.iobyxmoadg f71008gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f71009iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final SharedPreferences f71010ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zynmafqrjb f71011wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gk.zoijcleaow f71012zoijcleaow;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f71013yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f71014zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            eablkybsjgVar.f71013yggfygwlhe = obj;
            return eablkybsjgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f71014zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) this.f71013yggfygwlhe;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f71014zdlpuopuiu = 1;
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
        /* synthetic */ Object f71015cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f71017iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f71018jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f71019lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f71020yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f71021zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f71015cqumvgiudr = obj;
            this.f71019lereixgezr |= Integer.MIN_VALUE;
            return zoijcleaow.this.ojitshcjhn(null, null, this);
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f71023esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f71024iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f71025jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f71026yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f71027zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f71024iwizpuwonk = obj;
            this.f71023esjtqupxsv |= Integer.MIN_VALUE;
            return zoijcleaow.this.ppxfxbqfkf(null, this);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f71029esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f71030iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f71031jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f71032yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f71033zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f71030iwizpuwonk = obj;
            this.f71029esjtqupxsv |= Integer.MIN_VALUE;
            return zoijcleaow.this.rgvfuqvkyq(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f71034cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f71036jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f71037yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f71038zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f71036jyumaefscl = obj;
            this.f71034cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.dxjokdxxww(this);
        }
    }

    public static final class wkgbmnqykc implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f71039yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f71040zdlpuopuiu;

        public static final class iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f71041yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f71042zdlpuopuiu;

            /* JADX INFO: renamed from: nt1.zoijcleaow$wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1531iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f71044yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f71045zdlpuopuiu;

                public C1531iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f71045zdlpuopuiu = obj;
                    this.f71044yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, zoijcleaow zoijcleaowVar) {
                this.f71042zdlpuopuiu = nufgyqmvbuVar;
                this.f71041yggfygwlhe = zoijcleaowVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1531iobyxmoadg c1531iobyxmoadg;
                if (gxszxtbevoVar instanceof C1531iobyxmoadg) {
                    c1531iobyxmoadg = (C1531iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1531iobyxmoadg.f71044yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1531iobyxmoadg.f71044yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1531iobyxmoadg = new C1531iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1531iobyxmoadg = new C1531iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1531iobyxmoadg.f71045zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1531iobyxmoadg.f71044yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f71042zdlpuopuiu;
                    Set setGxszxtbevo = this.f71041yggfygwlhe.gxszxtbevo();
                    c1531iobyxmoadg.f71044yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(setGxszxtbevo, c1531iobyxmoadg) == objGxszxtbevo) {
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
            this.f71040zdlpuopuiu = lqeggnwhkgVar;
            this.f71039yggfygwlhe = zoijcleaowVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f71040zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f71039yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: nt1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C1532zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f71047esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f71048iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f71049jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f71050yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f71051zdlpuopuiu;

        C1532zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f71048iwizpuwonk = obj;
            this.f71047esjtqupxsv |= Integer.MIN_VALUE;
            return zoijcleaow.this.lqeggnwhkg(null, this);
        }
    }

    public zoijcleaow(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f71009iobyxmoadg = context;
        this.f71012zoijcleaow = jyumaefscl.zoijcleaow(null, new tg.draadjrbmk() { // from class: nt1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zoijcleaow.btonecajqb((eablkybsjg) obj);
            }
        }, 1, null);
        this.f71010ppxfxbqfkf = context.getSharedPreferences("stories_preferences", 0);
        this.f71011wkgbmnqykc = kegysxyocb.iobyxmoadg(null);
        this.f71007eablkybsjg = yj.lqeggnwhkg.zoijcleaow(false, 1, null);
        this.f71008gxszxtbevo = yj.lqeggnwhkg.zoijcleaow(false, 1, null);
    }

    private final void agtfadlqog(Set set) {
        SharedPreferences preferences = this.f71010ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(preferences, "preferences");
        SharedPreferences.Editor editorEdit = preferences.edit();
        gk.zoijcleaow zoijcleaowVar = this.f71012zoijcleaow;
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
            String string = this.f71010ppxfxbqfkf.getString("stories_viewed_map", null);
            if (string == null) {
                return null;
            }
            gk.zoijcleaow zoijcleaowVar = this.f71012zoijcleaow;
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
            String string = this.f71010ppxfxbqfkf.getString("stories_viewed_slides", null);
            if (string == null) {
                return null;
            }
            gk.zoijcleaow zoijcleaowVar = this.f71012zoijcleaow;
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
        SharedPreferences preferences = this.f71010ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(preferences, "preferences");
        SharedPreferences.Editor editorEdit = preferences.edit();
        gk.zoijcleaow zoijcleaowVar = this.f71012zoijcleaow;
        zoijcleaowVar.iobyxmoadg();
        wizcaqwiak wizcaqwiakVar = wizcaqwiak.f34245iobyxmoadg;
        editorEdit.putString("stories_viewed_map", zoijcleaowVar.zoijcleaow(ck.iobyxmoadg.yggfygwlhe(new dsvhmnatus(wizcaqwiakVar, wizcaqwiakVar)), linkedHashMap));
        editorEdit.apply();
    }

    public final sj.lqeggnwhkg draadjrbmk() {
        SharedPreferences preferences = this.f71010ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(preferences, "preferences");
        return new wkgbmnqykc(dxjokdxxww.tzroggbefp(jr0.lqeggnwhkg.iobyxmoadg(preferences, "stories_viewed_slides"), new eablkybsjg(null)), this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        zoijcleaow zoijcleaowVar;
        yj.iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f71034cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f71034cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f71036jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f71034cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            yj.iobyxmoadg iobyxmoadgVar2 = this.f71007eablkybsjg;
            ppxfxbqfkfVar.f71038zdlpuopuiu = this;
            ppxfxbqfkfVar.f71037yggfygwlhe = iobyxmoadgVar2;
            ppxfxbqfkfVar.f71034cqumvgiudr = 1;
            if (iobyxmoadgVar2.iobyxmoadg(null, ppxfxbqfkfVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
            iobyxmoadgVar = iobyxmoadgVar2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (yj.iobyxmoadg) ppxfxbqfkfVar.f71037yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) ppxfxbqfkfVar.f71038zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
        }
        try {
            return zoijcleaowVar.gxszxtbevo();
        } finally {
            iobyxmoadgVar.eablkybsjg(null);
        }
    }

    public final sj.lqeggnwhkg gtknphoqwx() {
        return dxjokdxxww.iobyxmoadg(this.f71011wkgbmnqykc);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object lqeggnwhkg(String str, lg.gxszxtbevo gxszxtbevoVar) {
        C1532zoijcleaow c1532zoijcleaow;
        yj.iobyxmoadg iobyxmoadgVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof C1532zoijcleaow) {
            c1532zoijcleaow = (C1532zoijcleaow) gxszxtbevoVar;
            int i13 = c1532zoijcleaow.f71047esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1532zoijcleaow.f71047esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                c1532zoijcleaow = new C1532zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c1532zoijcleaow = new C1532zoijcleaow(gxszxtbevoVar);
        }
        Object obj = c1532zoijcleaow.f71048iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1532zoijcleaow.f71047esjtqupxsv;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar = this.f71008gxszxtbevo;
            c1532zoijcleaow.f71051zdlpuopuiu = this;
            c1532zoijcleaow.f71050yggfygwlhe = str;
            c1532zoijcleaow.f71049jyumaefscl = iobyxmoadgVar;
            c1532zoijcleaow.f71047esjtqupxsv = 1;
            if (iobyxmoadgVar.iobyxmoadg(null, c1532zoijcleaow) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yj.iobyxmoadg iobyxmoadgVar2 = (yj.iobyxmoadg) c1532zoijcleaow.f71049jyumaefscl;
            String str2 = (String) c1532zoijcleaow.f71050yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) c1532zoijcleaow.f71051zdlpuopuiu;
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
        return (List) this.f71011wkgbmnqykc.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ojitshcjhn(String str, LocalDateTime localDateTime, lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        yj.iobyxmoadg iobyxmoadgVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f71019lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f71019lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object obj = gxszxtbevoVar2.f71015cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f71019lereixgezr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar = this.f71008gxszxtbevo;
            gxszxtbevoVar2.f71021zdlpuopuiu = this;
            gxszxtbevoVar2.f71020yggfygwlhe = str;
            gxszxtbevoVar2.f71018jyumaefscl = localDateTime;
            gxszxtbevoVar2.f71017iwizpuwonk = iobyxmoadgVar;
            gxszxtbevoVar2.f71019lereixgezr = 1;
            if (iobyxmoadgVar.iobyxmoadg(null, gxszxtbevoVar2) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yj.iobyxmoadg iobyxmoadgVar2 = (yj.iobyxmoadg) gxszxtbevoVar2.f71017iwizpuwonk;
            localDateTime = (LocalDateTime) gxszxtbevoVar2.f71018jyumaefscl;
            String str2 = (String) gxszxtbevoVar2.f71020yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar2.f71021zdlpuopuiu;
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
            int i13 = iobyxmoadgVar.f71023esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f71023esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f71024iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f71023esjtqupxsv;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar2 = this.f71007eablkybsjg;
            iobyxmoadgVar.f71027zdlpuopuiu = this;
            iobyxmoadgVar.f71026yggfygwlhe = str;
            iobyxmoadgVar.f71025jyumaefscl = iobyxmoadgVar2;
            iobyxmoadgVar.f71023esjtqupxsv = 1;
            if (iobyxmoadgVar2.iobyxmoadg(null, iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yj.iobyxmoadg iobyxmoadgVar3 = (yj.iobyxmoadg) iobyxmoadgVar.f71025jyumaefscl;
            String str2 = (String) iobyxmoadgVar.f71026yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f71027zdlpuopuiu;
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
            int i13 = lqeggnwhkgVar.f71029esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f71029esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object obj = lqeggnwhkgVar.f71030iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lqeggnwhkgVar.f71029esjtqupxsv;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar = this.f71007eablkybsjg;
            lqeggnwhkgVar.f71033zdlpuopuiu = this;
            lqeggnwhkgVar.f71032yggfygwlhe = list;
            lqeggnwhkgVar.f71031jyumaefscl = iobyxmoadgVar;
            lqeggnwhkgVar.f71029esjtqupxsv = 1;
            if (iobyxmoadgVar.iobyxmoadg(null, lqeggnwhkgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yj.iobyxmoadg iobyxmoadgVar2 = (yj.iobyxmoadg) lqeggnwhkgVar.f71031jyumaefscl;
            List list2 = (List) lqeggnwhkgVar.f71032yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) lqeggnwhkgVar.f71033zdlpuopuiu;
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
            zynmafqrjb zynmafqrjbVar = zoijcleaowVar.f71011wkgbmnqykc;
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
        zynmafqrjb zynmafqrjbVar = this.f71011wkgbmnqykc;
        do {
            value = zynmafqrjbVar.getValue();
        } while (!zynmafqrjbVar.compareAndSet(value, null));
    }
}
