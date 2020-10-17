import React from "react";
import { Link } from "react-router-dom";
import { FiPlus, FiArrowRight } from "react-icons/fi";
import Leaflet from "leaflet";

import { Map, TileLayer, Marker, Popup } from "react-leaflet";

import "leaflet/dist/leaflet.css";

import "../styles/pages/orphanages-map.css";

import mapMarkerImg from "../images/map-marker.svg";

const mapIcon = Leaflet.icon({
  iconUrl: mapMarkerImg,
  iconSize: [58, 68],
  iconAnchor: [29, 68],
  popupAnchor: [170, 2]
});

function OrphanagesMap() {
  return (
    <div id="page-map">
      <aside>
        <header>
          <img src={mapMarkerImg} alt="Happy" />

          <h2>Escolha um orfanato no mapa</h2>
          <p>Muitas crianças estão esperando a sua visita :)</p>
        </header>

        <footer>
          <strong>São Raimundo Nonato</strong>
          <span>Piauí</span>
        </footer>
      </aside>

      <Map
        center={[-9.0141181, -42.7108117]}
        zoom={15}
        style={{ width: "100%", height: "100%" }}
      >
        <TileLayer url="https:/a.tile.openstreetmap.org/{z}/{x}/{y}.png" />

        <Marker icon={mapIcon} position={[-9.0141181, -42.7108117]}>
          <Popup
            closeButton={false}
            minWidth={240}
            maxWidth={240}
            className="map-popup"
          >
            Lar das Meninas
            <Link to="">
              <FiArrowRight size={28} color="#FFF" />
            </Link>
          </Popup>
        </Marker>
      </Map>

      <Link to="" className="create-orphanage">
        <FiPlus size={32} color="#FFF" />
      </Link>
    </div>
  );
}

export default OrphanagesMap;
