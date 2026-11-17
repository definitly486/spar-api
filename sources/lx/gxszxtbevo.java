package lx;

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
import ru.myspar.contacts.api.model.Contact;
import ru.myspar.contacts.impl.contacts_screen.domain.model.ContactItem;
import sj.pmvmpeiblj;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo extends ft.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pmvmpeiblj f64326ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ix.iobyxmoadg f64327zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f64325wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f64324eablkybsjg = 8;

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f64328iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f64330yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f64331zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f64330yggfygwlhe = obj;
            this.f64328iwizpuwonk |= Integer.MIN_VALUE;
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
        private /* synthetic */ Object f64333yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f64334zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = gxszxtbevo.this.new eablkybsjg(gxszxtbevoVar);
            eablkybsjgVar.f64333yggfygwlhe = obj;
            return eablkybsjgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            sj.nufgyqmvbu nufgyqmvbuVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f64334zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    nufgyqmvbuVar = (sj.nufgyqmvbu) this.f64333yggfygwlhe;
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
            nufgyqmvbuVar = (sj.nufgyqmvbu) this.f64333yggfygwlhe;
            gxszxtbevo gxszxtbevoVar = gxszxtbevo.this;
            this.f64333yggfygwlhe = nufgyqmvbuVar;
            this.f64334zdlpuopuiu = 1;
            obj = gxszxtbevoVar.gtknphoqwx(this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            this.f64333yggfygwlhe = null;
            this.f64334zdlpuopuiu = 2;
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

    /* JADX INFO: renamed from: lx.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    static final class C1338gxszxtbevo extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f64335jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f64336yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f64337zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1338gxszxtbevo(zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f64335jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            C1338gxszxtbevo c1338gxszxtbevo = new C1338gxszxtbevo(this.f64335jyumaefscl, gxszxtbevoVar);
            c1338gxszxtbevo.f64336yggfygwlhe = obj;
            return c1338gxszxtbevo;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f64337zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f64336yggfygwlhe;
                String strIobyxmoadg = this.f64335jyumaefscl.iobyxmoadg();
                if (strIobyxmoadg == null) {
                    strIobyxmoadg = "";
                }
                this.f64337zdlpuopuiu = 1;
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
            return ((C1338gxszxtbevo) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
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
        final /* synthetic */ String f64338jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f64339yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f64340zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f64338jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(this.f64338jyumaefscl, gxszxtbevoVar);
            lqeggnwhkgVar.f64339yggfygwlhe = obj;
            return lqeggnwhkgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f64340zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f64339yggfygwlhe;
                String str = this.f64338jyumaefscl;
                this.f64340zdlpuopuiu = 1;
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
        /* synthetic */ Object f64341jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f64342yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f64343zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f64343zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            List list = (List) this.f64342yggfygwlhe;
            String str = (String) this.f64341jyumaefscl;
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
            nufgyqmvbuVar.f64342yggfygwlhe = list;
            nufgyqmvbuVar.f64341jyumaefscl = str;
            return nufgyqmvbuVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf extends draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f64344jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f64345yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f64346zdlpuopuiu;

        public ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f64346zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f64345yggfygwlhe;
                sj.lqeggnwhkg lqeggnwhkgVarWwaezpbzkn = sj.dxjokdxxww.wwaezpbzkn(new lqeggnwhkg((String) this.f64344jyumaefscl, null));
                this.f64346zdlpuopuiu = 1;
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
            ppxfxbqfkfVar.f64345yggfygwlhe = nufgyqmvbuVar;
            ppxfxbqfkfVar.f64344jyumaefscl = obj;
            return ppxfxbqfkfVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class wkgbmnqykc implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f64347zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f64348zdlpuopuiu;

            /* JADX INFO: renamed from: lx.gxszxtbevo$wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1339iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f64350yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f64351zdlpuopuiu;

                public C1339iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f64351zdlpuopuiu = obj;
                    this.f64350yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f64348zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1339iobyxmoadg c1339iobyxmoadg;
                LinkedHashMap linkedHashMap;
                if (gxszxtbevoVar instanceof C1339iobyxmoadg) {
                    c1339iobyxmoadg = (C1339iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1339iobyxmoadg.f64350yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1339iobyxmoadg.f64350yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1339iobyxmoadg = new C1339iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1339iobyxmoadg = new C1339iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1339iobyxmoadg.f64351zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1339iobyxmoadg.f64350yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f64348zdlpuopuiu;
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
                    c1339iobyxmoadg.f64350yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(linkedHashMap, c1339iobyxmoadg) == objGxszxtbevo) {
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
            this.f64347zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f64347zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f64352iobyxmoadg;

        public zoijcleaow(String str) {
            this.f64352iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f64352iobyxmoadg, ((zoijcleaow) obj).f64352iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f64352iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f64352iobyxmoadg;
        }

        public String toString() {
            return "Params(initQuery=" + this.f64352iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(ix.iobyxmoadg contactsLocalSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(contactsLocalSource, "contactsLocalSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f64327zoijcleaow = contactsLocalSource;
        this.f64326ppxfxbqfkf = sj.wwaezpbzkn.zoijcleaow(0, 0, null, 7, null);
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
            int i13 = btonecajqbVar.f64328iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                btonecajqbVar.f64328iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                btonecajqbVar = new btonecajqb(gxszxtbevoVar);
            }
        } else {
            btonecajqbVar = new btonecajqb(gxszxtbevoVar);
        }
        Object obj = btonecajqbVar.f64330yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = btonecajqbVar.f64328iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            List listRgvfuqvkyq = jyumaefscl.rgvfuqvkyq("79", "89");
            ix.iobyxmoadg iobyxmoadgVar = this.f64327zoijcleaow;
            btonecajqbVar.f64331zdlpuopuiu = listRgvfuqvkyq;
            btonecajqbVar.f64328iwizpuwonk = 1;
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
            list = (List) btonecajqbVar.f64331zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
        }
        List listCrxdokpmqz = wflxmlrfwp.crxdokpmqz(wflxmlrfwp.wypolnanlu(wflxmlrfwp.ntlheqmsrt(wflxmlrfwp.esjtqupxsv(wflxmlrfwp.dsvhmnatus(wflxmlrfwp.istkbnxepw(wflxmlrfwp.ylkuphrtab(wflxmlrfwp.istkbnxepw(jyumaefscl.ikoacuggdj((Iterable) obj), new tg.draadjrbmk() { // from class: lx.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(gxszxtbevo.wflxmlrfwp((Contact) obj2));
            }
        }), new tg.draadjrbmk() { // from class: lx.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj2) {
                return gxszxtbevo.agtfadlqog((Contact) obj2);
            }
        }), new tg.draadjrbmk() { // from class: lx.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(gxszxtbevo.ojitshcjhn(list, (vdvldrhtss) obj2));
            }
        }), new tg.draadjrbmk() { // from class: lx.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj2) {
                return gxszxtbevo.rgvfuqvkyq((vdvldrhtss) obj2);
            }
        })), new dxjokdxxww()), new rgvfuqvkyq() { // from class: lx.eablkybsjg
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
    @Override // ft.iobyxmoadg
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public sj.lqeggnwhkg iobyxmoadg(zoijcleaow parameters) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
        return new wkgbmnqykc(sj.dxjokdxxww.wflxmlrfwp(sj.dxjokdxxww.wwaezpbzkn(new eablkybsjg(null)), sj.dxjokdxxww.ikoacuggdj(sj.dxjokdxxww.vdvldrhtss(sj.dxjokdxxww.ojitshcjhn(sj.dxjokdxxww.tzroggbefp(sj.dxjokdxxww.iobyxmoadg(this.f64326ppxfxbqfkf), new C1338gxszxtbevo(parameters, null)), 300L)), new ppxfxbqfkf(null)), new nufgyqmvbu(null)));
    }

    public final Object dxjokdxxww(String str, lg.gxszxtbevo gxszxtbevoVar) {
        Object objEmit = this.f64326ppxfxbqfkf.emit(str, gxszxtbevoVar);
        return objEmit == mg.zoijcleaow.gxszxtbevo() ? objEmit : wwaezpbzkn.f37140iobyxmoadg;
    }
}
