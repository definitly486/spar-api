package ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, eablkybsjg msg) {
        ContactsStore$SearchContent contactsStore$SearchContent;
        ContactsStore$SearchContent contactsStore$SearchContent2;
        ContactsStore$SearchContent contactsStore$SearchContent3;
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof eablkybsjg.iobyxmoadg) {
            return State.ppxfxbqfkf(state, null, null, null, ((eablkybsjg.iobyxmoadg) msg).iobyxmoadg(), 7, null);
        }
        ContactsStore$SearchContent.ContactList contactListEablkybsjg = null;
        if (msg instanceof eablkybsjg.wkgbmnqykc) {
            return State.ppxfxbqfkf(state, null, EditContact.ppxfxbqfkf(state.getEditContact(), null, ((eablkybsjg.wkgbmnqykc) msg).iobyxmoadg(), 1, null), null, false, 13, null);
        }
        if (msg instanceof eablkybsjg.ppxfxbqfkf) {
            return State.ppxfxbqfkf(state, null, EditContact.ppxfxbqfkf(state.getEditContact(), ((eablkybsjg.ppxfxbqfkf) msg).iobyxmoadg(), null, 2, null), null, false, 13, null);
        }
        if (msg instanceof eablkybsjg.C2216eablkybsjg) {
            return State.ppxfxbqfkf(state, null, null, ((eablkybsjg.C2216eablkybsjg) msg).iobyxmoadg(), false, 11, null);
        }
        if (msg instanceof eablkybsjg.lqeggnwhkg) {
            ContactsStore$SearchContent searchContent = state.getSearchContent();
            if (searchContent == null) {
                contactsStore$SearchContent3 = contactListEablkybsjg;
            } else if (searchContent instanceof ContactsStore$SearchContent.ContactList) {
                ContactsStore$SearchContent.ContactList contactList = (ContactsStore$SearchContent.ContactList) searchContent;
                Integer numValueOf = Integer.valueOf(((eablkybsjg.lqeggnwhkg) msg).iobyxmoadg());
                int iIntValue = numValueOf.intValue();
                Integer contactId = contactList.getContactId();
                contactListEablkybsjg = ContactsStore$SearchContent.ContactList.eablkybsjg(contactList, false, null, null, (contactId != null && iIntValue == contactId.intValue()) ? null : numValueOf, 7, null);
                contactsStore$SearchContent3 = contactListEablkybsjg;
            } else {
                contactsStore$SearchContent3 = searchContent;
            }
            return State.ppxfxbqfkf(state, null, null, contactsStore$SearchContent3, false, 11, null);
        }
        if (msg instanceof eablkybsjg.gxszxtbevo) {
            ContactsStore$SearchContent searchContent2 = state.getSearchContent();
            if (searchContent2 == null) {
                contactsStore$SearchContent2 = contactListEablkybsjg;
            } else if (searchContent2 instanceof ContactsStore$SearchContent.ContactList) {
                contactListEablkybsjg = ContactsStore$SearchContent.ContactList.eablkybsjg((ContactsStore$SearchContent.ContactList) searchContent2, false, null, ((eablkybsjg.gxszxtbevo) msg).iobyxmoadg(), null, 11, null);
                contactsStore$SearchContent2 = contactListEablkybsjg;
            } else {
                contactsStore$SearchContent2 = searchContent2;
            }
            return State.ppxfxbqfkf(state, null, null, contactsStore$SearchContent2, false, 11, null);
        }
        if (!(msg instanceof eablkybsjg.zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        ContactsStore$SearchContent searchContent3 = state.getSearchContent();
        if (searchContent3 == null) {
            contactsStore$SearchContent = contactListEablkybsjg;
        } else if (searchContent3 instanceof ContactsStore$SearchContent.ContactList) {
            contactListEablkybsjg = ContactsStore$SearchContent.ContactList.eablkybsjg((ContactsStore$SearchContent.ContactList) searchContent3, false, ((eablkybsjg.zoijcleaow) msg).iobyxmoadg(), null, null, 12, null);
            contactsStore$SearchContent = contactListEablkybsjg;
        } else {
            contactsStore$SearchContent = searchContent3;
        }
        return State.ppxfxbqfkf(state, null, null, contactsStore$SearchContent, false, 11, null);
    }
}
