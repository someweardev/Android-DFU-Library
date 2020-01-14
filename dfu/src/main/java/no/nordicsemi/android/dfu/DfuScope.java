package no.nordicsemi.android.dfu;

import android.support.annotation.IntDef;

@SuppressWarnings("WeakerAccess")
@IntDef(value = {
            DfuServiceInitiator.SCOPE_SYSTEM_COMPONENTS,
            DfuServiceInitiator.SCOPE_APPLICATION
        },
        flag = true)
public @interface DfuScope {}
