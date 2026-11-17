package mw0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.provider.ContactsContract;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import pj.gtknphoqwx;
import pj.ikoacuggdj;
import pj.ntlheqmsrt;
import rg.zoijcleaow;
import ru.myspar.proloyalty.contacts.api.model.Contact;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements fw0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f68025iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ContextWrapper f68026zoijcleaow;

    /* JADX INFO: renamed from: mw0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1456iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f68028yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f68029zdlpuopuiu;

        /* JADX INFO: renamed from: mw0.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1457iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f68030yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f68031zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1457iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f68030yggfygwlhe = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
                return new C1457iobyxmoadg(this.f68030yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f68031zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                return this.f68030yggfygwlhe.eablkybsjg();
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
                return ((C1457iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX INFO: renamed from: mw0.iobyxmoadg$iobyxmoadg$zoijcleaow */
        static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f68032yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f68033zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f68032yggfygwlhe = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
                return new zoijcleaow(this.f68032yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f68033zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                return this.f68032yggfygwlhe.wkgbmnqykc();
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
                return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        C1456iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            C1456iobyxmoadg c1456iobyxmoadg = iobyxmoadg.this.new C1456iobyxmoadg(gxszxtbevoVar);
            c1456iobyxmoadg.f68028yggfygwlhe = obj;
            return c1456iobyxmoadg;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0073  */
        /* JADX WARN: Code duplicated, block: B:26:0x0085 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:28:0x006d A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            ntlheqmsrt ntlheqmsrtVar;
            List<Contact> list;
            HashMap map;
            ArrayList arrayList;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f68029zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    ntlheqmsrtVar = (ntlheqmsrt) this.f68028yggfygwlhe;
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.f68028yggfygwlhe;
                    zdlpuopuiu.zoijcleaow(obj);
                }
                map = (HashMap) obj;
                for (Contact contact : list) {
                    arrayList = (ArrayList) map.get(contact.getId());
                    if (arrayList != null) {
                        contact.ppxfxbqfkf(arrayList);
                    }
                }
                return list;
            }
            zdlpuopuiu.zoijcleaow(obj);
            cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) this.f68028yggfygwlhe;
            ntlheqmsrt ntlheqmsrtVarZoijcleaow = gtknphoqwx.zoijcleaow(cllcsxoeizVar, null, null, new zoijcleaow(iobyxmoadg.this, null), 3, null);
            ntlheqmsrt ntlheqmsrtVarZoijcleaow2 = gtknphoqwx.zoijcleaow(cllcsxoeizVar, null, null, new C1457iobyxmoadg(iobyxmoadg.this, null), 3, null);
            this.f68028yggfygwlhe = ntlheqmsrtVarZoijcleaow2;
            this.f68029zdlpuopuiu = 1;
            Object objLqeggnwhkg = ntlheqmsrtVarZoijcleaow.lqeggnwhkg(this);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ntlheqmsrtVar = ntlheqmsrtVarZoijcleaow2;
            obj = objLqeggnwhkg;
            List list2 = (List) obj;
            this.f68028yggfygwlhe = list2;
            this.f68029zdlpuopuiu = 2;
            Object objLqeggnwhkg2 = ntlheqmsrtVar.lqeggnwhkg(this);
            if (objLqeggnwhkg2 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            list = list2;
            obj = objLqeggnwhkg2;
            map = (HashMap) obj;
            while (r1.hasNext()) {
                arrayList = (ArrayList) map.get(contact.getId());
                if (arrayList != null) {
                    contact.ppxfxbqfkf(arrayList);
                }
            }
            return list;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((C1456iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public iobyxmoadg(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f68025iobyxmoadg = context;
        this.f68026zoijcleaow = new ContextWrapper(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HashMap eablkybsjg() {
        HashMap map = new HashMap();
        Cursor cursorQuery = this.f68026zoijcleaow.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            try {
                int columnIndex = cursorQuery.getColumnIndex("contact_id");
                int columnIndex2 = cursorQuery.getColumnIndex("data1");
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndex);
                    String string2 = cursorQuery.getString(columnIndex2);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string2, "getString(...)");
                    if (map.containsKey(string)) {
                        ArrayList arrayList = (ArrayList) map.get(string);
                        if (arrayList != null) {
                            arrayList.add(string2);
                        }
                    } else {
                        map.put(string, jyumaefscl.lqeggnwhkg(string2));
                    }
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                zoijcleaow.iobyxmoadg(cursorQuery, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    zoijcleaow.iobyxmoadg(cursorQuery, th2);
                    throw th3;
                }
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List wkgbmnqykc() {
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolver = this.f68026zoijcleaow.getContentResolver();
        Cursor cursorQuery = contentResolver != null ? contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, "display_name ASC") : null;
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            try {
                int columnIndex = cursorQuery.getColumnIndex("_id");
                int columnIndex2 = cursorQuery.getColumnIndex("display_name");
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndex);
                    String string2 = cursorQuery.getString(columnIndex2);
                    if (string2 != null) {
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(string);
                        arrayList.add(new Contact(string, string2));
                    }
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                zoijcleaow.iobyxmoadg(cursorQuery, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    zoijcleaow.iobyxmoadg(cursorQuery, th2);
                    throw th3;
                }
            }
        }
        return arrayList;
    }

    @Override // fw0.iobyxmoadg
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(ikoacuggdj.zoijcleaow(), new C1456iobyxmoadg(null), gxszxtbevoVar);
    }
}
