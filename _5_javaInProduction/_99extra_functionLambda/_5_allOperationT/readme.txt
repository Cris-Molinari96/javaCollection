Quello che abbiamo fatto è satto creare un intefraccia marcata con la notazione @FunctionalInterface, quest'interfaccia ci
servirà per eseguire un espressione lambda le quali espressioni possono essere applicate solo su interacce funzionali ossia le
interfacce che hanno un solo metodo astratto e tale metodo sarà sovrascritto.

Abbiamo crato un metodo statico, che accetta un ritorno di un tipo di dato qualsiasi e come parametro accetterà
l'interfaccia funzionale, e altri due valori dichiarati nel metodo astratto dell'interfaccia.
Nel corpo del metodo sarà richiamato il metodo dell'interfaccia funzionale per eseguire l'operazione sui valori

