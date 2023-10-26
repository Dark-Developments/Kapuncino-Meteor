/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package com.dark.zewo2.modules;

import com.dark.zewo2.Addon;
import meteordevelopment.meteorclient.events.game.ReceiveMessageEvent;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;

public class NoClearChat extends Module {
    public NoClearChat() {
        super(Addon.CATEGORY, "No Chat Clear", "Stops shitty skript ClearChat");
    }

    @EventHandler
    private void revieveMessage(ReceiveMessageEvent event){
        String message = event.getMessage().getString();

        if (message.isEmpty()){
            event.cancel();
        }
    }

    @Override
    public void onActivate() {

    }
}
