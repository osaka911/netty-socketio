package com.corundumstudio.socketio.listener;

import com.corundumstudio.socketio.SocketIOClient;

public interface PongListener {
  void onPong(SocketIOClient client);
}
