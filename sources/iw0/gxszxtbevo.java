package iw0;

import gg.cqumvgiudr;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import lj.wflxmlrfwp;
import mj.kcexrzcfyt;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.contacts.api.model.Contact;
import ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.model.ContactItem;
import sj.pmvmpeiblj;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo extends zr0.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pmvmpeiblj f49668ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final fw0.iobyxmoadg f49669zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f49667wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f49666eablkybsjg = 8;

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f49670iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f49672yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f49673zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49672yggfygwlhe = obj;
            this.f49670iwizpuwonk |= Integer.MIN_VALUE;
            return gxszxtbevo.this.gtknphoqwx(this);
        }
    }

    public static final class dxjokdxxww implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc((String) ((vdvldrhtss) obj).iobyxmoadg(), (String) ((vdvldrhtss) obj2).iobyxmoadg());
        }
    }

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f49675yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f49676zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = gxszxtbevo.this.new eablkybsjg(gxszxtbevoVar);
            eablkybsjgVar.f49675yggfygwlhe = obj;
            return eablkybsjgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            sj.nufgyqmvbu nufgyqmvbuVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f49676zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    nufgyqmvbuVar = (sj.nufgyqmvbu) this.f49675yggfygwlhe;
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            nufgyqmvbuVar = (sj.nufgyqmvbu) this.f49675yggfygwlhe;
            gxszxtbevo gxszxtbevoVar = gxszxtbevo.this;
            this.f49675yggfygwlhe = nufgyqmvbuVar;
            this.f49676zdlpuopuiu = 1;
            obj = gxszxtbevoVar.gtknphoqwx(this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            this.f49675yggfygwlhe = null;
            this.f49676zdlpuopuiu = 2;
            if (nufgyqmvbuVar.emit(obj, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: iw0.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    static final class C1055gxszxtbevo extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f49677jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f49678yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f49679zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1055gxszxtbevo(zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f49677jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            C1055gxszxtbevo c1055gxszxtbevo = new C1055gxszxtbevo(this.f49677jyumaefscl, gxszxtbevoVar);
            c1055gxszxtbevo.f49678yggfygwlhe = obj;
            return c1055gxszxtbevo;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f49679zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f49678yggfygwlhe;
                String strIobyxmoadg = this.f49677jyumaefscl.iobyxmoadg();
                if (strIobyxmoadg == null) {
                    strIobyxmoadg = "";
                }
                this.f49679zdlpuopuiu = 1;
                if (nufgyqmvbuVar.emit(strIobyxmoadg, this) == objGxszxtbevo) {
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
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C1055gxszxtbevo) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class lqeggnwhkg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f49680jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f49681yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f49682zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f49680jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(this.f49680jyumaefscl, gxszxtbevoVar);
            lqeggnwhkgVar.f49681yggfygwlhe = obj;
            return lqeggnwhkgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f49682zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f49681yggfygwlhe;
                String str = this.f49680jyumaefscl;
                this.f49682zdlpuopuiu = 1;
                if (nufgyqmvbuVar.emit(str, this) == objGxszxtbevo) {
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
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f49683jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f49684yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f49685zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f49685zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            List list = (List) this.f49684yggfygwlhe;
            String str = (String) this.f49683jyumaefscl;
            if (kcexrzcfyt.zfvoamnweg(str)) {
                return list;
            }
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                ContactItem contactItem = (ContactItem) obj2;
                if (kcexrzcfyt.ntlheqmsrt(contactItem.getContactName(), str, true) || kcexrzcfyt.ntlheqmsrt(contactItem.getContactPhone(), str, true)) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, String str, lg.gxszxtbevo gxszxtbevoVar) {
            nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
            nufgyqmvbuVar.f49684yggfygwlhe = list;
            nufgyqmvbuVar.f49683jyumaefscl = str;
            return nufgyqmvbuVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf extends draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f49686jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f49687yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f49688zdlpuopuiu;

        public ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f49688zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f49687yggfygwlhe;
                sj.lqeggnwhkg lqeggnwhkgVarWwaezpbzkn = sj.dxjokdxxww.wwaezpbzkn(new lqeggnwhkg((String) this.f49686jyumaefscl, null));
                this.f49688zdlpuopuiu = 1;
                if (sj.dxjokdxxww.iwizpuwonk(nufgyqmvbuVar, lqeggnwhkgVarWwaezpbzkn, this) == objGxszxtbevo) {
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

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            ppxfxbqfkfVar.f49687yggfygwlhe = nufgyqmvbuVar;
            ppxfxbqfkfVar.f49686jyumaefscl = obj;
            return ppxfxbqfkfVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class wkgbmnqykc implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f49689zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f49690zdlpuopuiu;

            /* JADX INFO: renamed from: iw0.gxszxtbevo$wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1056iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f49692yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f49693zdlpuopuiu;

                public C1056iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f49693zdlpuopuiu = obj;
                    this.f49692yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f49690zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1056iobyxmoadg c1056iobyxmoadg;
                LinkedHashMap linkedHashMap;
                if (gxszxtbevoVar instanceof C1056iobyxmoadg) {
                    c1056iobyxmoadg = (C1056iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1056iobyxmoadg.f49692yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1056iobyxmoadg.f49692yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1056iobyxmoadg = new C1056iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1056iobyxmoadg = new C1056iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1056iobyxmoadg.f49693zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1056iobyxmoadg.f49692yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f49690zdlpuopuiu;
                    List list = (List) obj;
                    if (list != null) {
                        linkedHashMap = new LinkedHashMap();
                        for (Object obj3 : list) {
                            String upperCase = kcexrzcfyt.y(((ContactItem) obj3).getContactName(), 1).toUpperCase(Locale.ROOT);
                            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(upperCase, "toUpperCase(...)");
                            Object arrayList = linkedHashMap.get(upperCase);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(upperCase, arrayList);
                            }
                            ((List) arrayList).add(obj3);
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    c1056iobyxmoadg.f49692yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(linkedHashMap, c1056iobyxmoadg) == objGxszxtbevo) {
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

        public wkgbmnqykc(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f49689zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f49689zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f49694iobyxmoadg;

        public zoijcleaow(String str) {
            this.f49694iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f49694iobyxmoadg, ((zoijcleaow) obj).f49694iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f49694iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f49694iobyxmoadg;
        }

        public String toString() {
            return "Params(initQuery=" + this.f49694iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(fw0.iobyxmoadg contactsLocalSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(contactsLocalSource, "contactsLocalSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f49669zoijcleaow = contactsLocalSource;
        this.f49668ppxfxbqfkf = sj.wwaezpbzkn.zoijcleaow(0, 0, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable agtfadlqog(Contact contact) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(contact, "contact");
        ArrayList<String> numbers = contact.getNumbers();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(numbers, 10));
        for (String str : numbers) {
            StringBuilder sb3 = new StringBuilder();
            int length = str.length();
            for (int i13 = 0; i13 < length; i13++) {
                char cCharAt = str.charAt(i13);
                if (Character.isDigit(cCharAt)) {
                    sb3.append(cCharAt);
                }
            }
            arrayList.add(cqumvgiudr.iobyxmoadg(contact.getName(), sb3.toString()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContactItem draadjrbmk(int i13, vdvldrhtss vdvldrhtssVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(vdvldrhtssVar, "<destruct>");
        return new ContactItem(i13, (String) vdvldrhtssVar.iobyxmoadg(), (String) vdvldrhtssVar.wkgbmnqykc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
        btonecajqb btonecajqbVar;
        final List list;
        if (gxszxtbevoVar instanceof btonecajqb) {
            btonecajqbVar = (btonecajqb) gxszxtbevoVar;
            int i13 = btonecajqbVar.f49670iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                btonecajqbVar.f49670iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                btonecajqbVar = new btonecajqb(gxszxtbevoVar);
            }
        } else {
            btonecajqbVar = new btonecajqb(gxszxtbevoVar);
        }
        Object obj = btonecajqbVar.f49672yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = btonecajqbVar.f49670iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            List listRgvfuqvkyq = jyumaefscl.rgvfuqvkyq("79", "89");
            fw0.iobyxmoadg iobyxmoadgVar = this.f49669zoijcleaow;
            btonecajqbVar.f49673zdlpuopuiu = listRgvfuqvkyq;
            btonecajqbVar.f49670iwizpuwonk = 1;
            Object objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(btonecajqbVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            list = listRgvfuqvkyq;
            obj = objIobyxmoadg;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) btonecajqbVar.f49673zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
        }
        List listCrxdokpmqz = wflxmlrfwp.crxdokpmqz(wflxmlrfwp.wypolnanlu(wflxmlrfwp.ntlheqmsrt(wflxmlrfwp.esjtqupxsv(wflxmlrfwp.dsvhmnatus(wflxmlrfwp.istkbnxepw(wflxmlrfwp.ylkuphrtab(wflxmlrfwp.istkbnxepw(jyumaefscl.ikoacuggdj((Iterable) obj), new tg.draadjrbmk() { // from class: iw0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(gxszxtbevo.wflxmlrfwp((Contact) obj2));
            }
        }), new tg.draadjrbmk() { // from class: iw0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj2) {
                return gxszxtbevo.agtfadlqog((Contact) obj2);
            }
        }), new tg.draadjrbmk() { // from class: iw0.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(gxszxtbevo.ojitshcjhn(list, (vdvldrhtss) obj2));
            }
        }), new tg.draadjrbmk() { // from class: iw0.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj2) {
                return gxszxtbevo.rgvfuqvkyq((vdvldrhtss) obj2);
            }
        })), new dxjokdxxww()), new rgvfuqvkyq() { // from class: iw0.eablkybsjg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj2, Object obj3) {
                return gxszxtbevo.draadjrbmk(((Integer) obj2).intValue(), (vdvldrhtss) obj3);
            }
        }));
        if (listCrxdokpmqz.isEmpty()) {
            return null;
        }
        return listCrxdokpmqz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ojitshcjhn(List list, vdvldrhtss vdvldrhtssVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(vdvldrhtssVar, "<destruct>");
        String str = (String) vdvldrhtssVar.wkgbmnqykc();
        return str.length() == 11 && list.contains(kcexrzcfyt.y(str, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vdvldrhtss rgvfuqvkyq(vdvldrhtss vdvldrhtssVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(vdvldrhtssVar, "<destruct>");
        String str = (String) vdvldrhtssVar.iobyxmoadg();
        String str2 = (String) vdvldrhtssVar.wkgbmnqykc();
        if (str2.length() > 0) {
            str2.charAt(0);
            String strSubstring = str2.substring(1);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
            str2 = '7' + strSubstring;
        }
        return cqumvgiudr.iobyxmoadg(str, "+" + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean wflxmlrfwp(Contact it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return !it.getNumbers().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.iobyxmoadg
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public sj.lqeggnwhkg iobyxmoadg(zoijcleaow parameters) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
        return new wkgbmnqykc(sj.dxjokdxxww.wflxmlrfwp(sj.dxjokdxxww.wwaezpbzkn(new eablkybsjg(null)), sj.dxjokdxxww.ikoacuggdj(sj.dxjokdxxww.vdvldrhtss(sj.dxjokdxxww.ojitshcjhn(sj.dxjokdxxww.tzroggbefp(sj.dxjokdxxww.iobyxmoadg(this.f49668ppxfxbqfkf), new C1055gxszxtbevo(parameters, null)), 300L)), new ppxfxbqfkf(null)), new nufgyqmvbu(null)));
    }

    public final Object dxjokdxxww(String str, lg.gxszxtbevo gxszxtbevoVar) {
        Object objEmit = this.f49668ppxfxbqfkf.emit(str, gxszxtbevoVar);
        return objEmit == mg.zoijcleaow.gxszxtbevo() ? objEmit : wwaezpbzkn.f37140iobyxmoadg;
    }
}
