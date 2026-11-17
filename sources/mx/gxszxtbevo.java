package mx;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.contacts.impl.contacts_screen.domain.model.ContactItem;
import ru.myspar.contacts.impl.contacts_screen.domain.store.ContactsStore$SearchContent;
import ru.myspar.contacts.impl.contacts_screen.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo implements draadjrbmk {
    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg invoke(State state) {
        nufgyqmvbu iobyxmoadgVar;
        zdlpuopuiu.btonecajqb(state, "state");
        ContactsStore$SearchContent searchContent = state.getSearchContent();
        if (searchContent instanceof ContactsStore$SearchContent.ContactList) {
            boolean z13 = state.getContactIsSending() || ((ContactsStore$SearchContent.ContactList) searchContent).getIsLoading();
            ContactsStore$SearchContent.ContactList contactList = (ContactsStore$SearchContent.ContactList) searchContent;
            tzroggbefp query = contactList.getQuery();
            Map contacts = contactList.getContacts();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : contacts.entrySet()) {
                String str = (String) entry.getKey();
                List<ContactItem> list = (List) entry.getValue();
                List listEablkybsjg = jyumaefscl.eablkybsjg(new ox.zoijcleaow.C1633zoijcleaow(str));
                ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
                for (ContactItem contactItem : list) {
                    int id2 = contactItem.getId();
                    String contactPhone = contactItem.getContactPhone();
                    String contactName = contactItem.getContactName();
                    Integer contactId = contactList.getContactId();
                    arrayList2.add(new ox.zoijcleaow.iobyxmoadg(id2, contactName, contactPhone, contactId != null && contactId.intValue() == contactItem.getId()));
                }
                jyumaefscl.istkbnxepw(arrayList, jyumaefscl.ixidwrxhsl(listEablkybsjg, arrayList2));
            }
            iobyxmoadgVar = new nufgyqmvbu.ppxfxbqfkf(z13, query, arrayList, contactList.getContactId() != null);
        } else if (zdlpuopuiu.eablkybsjg(searchContent, ContactsStore$SearchContent.Empty.f86419zdlpuopuiu)) {
            iobyxmoadgVar = nufgyqmvbu.zoijcleaow.f68045iobyxmoadg;
        } else {
            if (searchContent != null) {
                throw new NoWhenBranchMatchedException();
            }
            iobyxmoadgVar = new nufgyqmvbu.iobyxmoadg(state.getContactIsSending(), state.getEditContact().getName(), state.getEditContact().getPhone(), state.getEditContact().getNameIsValid() && state.getEditContact().getPhoneIsValid(), !state.getEditContact().getNameIsValid(), !state.getEditContact().getPhoneIsValid());
        }
        return new lqeggnwhkg(iobyxmoadgVar);
    }
}
