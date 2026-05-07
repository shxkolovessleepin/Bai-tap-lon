package com.auction.controller;

import com.auction.util.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AuctionMenuController {
    @FXML
    private void profileAction(ActionEvent event) {
        SceneUtil.changeScene(event, "/com/auction/view/Profile.fxml");
    }

    @FXML
    private void auctionMenuAction(ActionEvent event) {
        SceneUtil.changeScene(event, "/com/auction/view/AuctionMenu.fxml");
    }
}
